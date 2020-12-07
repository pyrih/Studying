package org.pyrih.zaur.multithreading;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1_000);
        }
        System.out.println("Let's go!");
    }
}
