package org.pyrih.zaur.multithreading;

public class Ex10_2 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);
        Thread t3 = new Thread(runner);

        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter {
    static int count = 0;
}

class Runner implements Runnable {
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
