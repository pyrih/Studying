package org.pyrih.us.basics;

@FunctionalInterface
public interface Printer {
    void print(String msg);

    // since ch. 5
    default void colorPrint(String msg) {
        System.out.println("Default method. Message: " + msg);
    }
}
