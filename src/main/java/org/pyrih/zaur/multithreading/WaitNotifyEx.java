package org.pyrih.zaur.multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}

class Market {
//    private final Object lock = new Object();
    private int breads = 0;

    public synchronized void get() throws InterruptedException {
//        synchronized (lock) {
            while (breads < 1) { // Рекомендация javadoc. Поток в редких случаях может проснуться без notify(). Поэтому используем while вместо if
                wait();
//                lock.wait();
            }

            breads--;
            System.out.println("Consumer have bought 1 bread. Breads quantity is: " + breads);
            notify();
//            lock.notify();
//        }
    }

    public synchronized void put() throws InterruptedException {
//        synchronized (lock) {
            while (breads >= 5) {
                wait();
//                wait(100);
//                 lock.wait();
            }

            breads++;
            System.out.println("Producer have put 1 bread. Breads quantity is: " + breads);
            notify();
//            lock.notify();
        }
//    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                market.put();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                market.get();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
