package org.pyrih.zaur.multithreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The main is started...");

        Thread worker = new Thread(new Worker());
        worker.start();
        worker.join(750);  // ждет выполнения потока или через 0,75 продолжает свою работу

        Thread cleaner = new Thread(new Cleaner());
        System.out.println(cleaner.getState());
        cleaner.start();
        System.out.println(cleaner.getState());
        cleaner.join();
        System.out.println(cleaner.getState());
        System.out.println("The main is done.");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker is started...");
        try {
            Thread.sleep(2_500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker is done.");
    }
}

class Cleaner implements Runnable {

    @Override
    public void run() {
        System.out.println("Cleaner is started...");
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cleaner is done.");
    }
}
