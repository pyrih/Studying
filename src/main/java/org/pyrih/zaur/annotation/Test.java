package org.pyrih.zaur.annotation;

import java.lang.annotation.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomi = Class.forName("org.pyrih.zaur.annotation.Xiaomi");
        Annotation annotation = xiaomi.getAnnotation(Smartphone.class);
        Smartphone smartphone = (Smartphone) annotation;
        System.out.println(smartphone.OS() + " : " + smartphone.yearOfCreation() );
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone {
    String OS() default "Android";
    int yearOfCreation();
}

@Smartphone(yearOfCreation = 2010)
class Xiaomi {
    String model;
    double price;
}

@Smartphone(OS = "IOS", yearOfCreation = 1976)
class Iphone {
    String model;
    double price;
}
