import annotations.AnnotationChecker;
import annotations.MyAnnotation;
import annotations.MyAnnotationChecker;
import human.Person;
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

public class App {

    public static void main(String[] args) {
        MyAnnotationChecker checker = new MyAnnotationChecker();
        checker.printAllValuesinGivenPackage("human");

    }

}


