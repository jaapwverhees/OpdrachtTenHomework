package annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MyAnnotationChecker extends AnnotationChecker {



    public ArrayList<String> getAllValuesInClass(Class<?> klas){
        ArrayList<String> list = new ArrayList<>();

        Method[] methods = klas.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                list.add("MyAnnotation value of method: " +method+ " = " + method.getAnnotation(MyAnnotation.class).value());
            }
        }
        return list;
    }
    public void printAllValuesinGivenPackage(String packageName){
        for (Class<?> klass: getAllClassByAnnotation(MyAnnotation.class,getAllClassesByPackage(packageName))) {
            System.out.println("klass: " + klass.toString());

            for (String string :getAllValuesInClass(klass)) {
                System.out.println(string);
            }
        }
    }
}
