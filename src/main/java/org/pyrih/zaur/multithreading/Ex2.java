package org.pyrih.zaur.multithreading;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Main method: " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

        MyThread1 thread1 = new MyThread1();
        thread1.setName("My-Thread");
        System.out.println("Thread name: " + thread1.getName() + ". Priority: " + thread1.getPriority());

        MyThread2 thread2 = new MyThread2();

        Thread thread3 = new Thread(new MyThread3());
        thread3.setPriority(9);
        System.out.println("Thread name: " + thread3.getName() + ". Priority: " + thread3.getPriority());

        Thread thread4 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anon");
            }
        }).start();

        new Thread(() -> {
            System.out.println("Lambda");
        }).start();

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1001; i <= 2000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 2000; i > 1000; i--) {
            System.out.println(i);
        }
    }
}
