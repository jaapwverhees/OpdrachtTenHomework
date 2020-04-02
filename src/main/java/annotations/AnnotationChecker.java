package annotations;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AnnotationChecker {

    public Set<Class<?>> getAllClassesByPackage(String packageName){
        List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());

        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(packageName))));

        return reflections.getSubTypesOf(Object.class);
    }

    public ArrayList<Class<?>> getAllClassByAnnotation(Class<?extends Annotation> annotation, Set<Class<?>> inputSet){
        ArrayList<Class<?>> klasses = new ArrayList<>();
        for (Class<?> klas: inputSet) {
            for (Method method: klas.getDeclaredMethods()) {
                if (method.isAnnotationPresent(annotation)) {
                    klasses.add(klas);
                    break;
                }
            }
        }
        return klasses;
    }
}
