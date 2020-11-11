package org.pyrih.zaur.annotation;

public class One {
    public static void main(String[] args) {
        Parent p = new Child("Zaur");
        p.showInfo();
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Parent. Name: " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("Child. Name: " + name);
    }
}