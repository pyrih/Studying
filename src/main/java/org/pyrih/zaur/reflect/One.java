package org.pyrih.zaur.reflect;

import org.pyrih.zaur.annotation.Employee;

public class One {
    public static void main(String[] args) {
        Class aClass = Employee.class;
        String name = aClass.getName();

    }
}
