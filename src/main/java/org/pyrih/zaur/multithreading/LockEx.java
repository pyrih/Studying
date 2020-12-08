package org.pyrih.zaur.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();

        Thread t1 = new Thread(call::skype);
        Thread t2 = new Thread(call::viber);
        Thread t3 = new Thread(call::telegram);

        t1.start();
        t2.start();
        t3.start();


    }
}

class Call {
    private Lock lock = new ReentrantLock();

    public void skype() {
        lock.lock();
        try {
            System.out.println("Skype UP");
            Thread.sleep(3000);
            System.out.println("Skype DOWN");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void viber() {
        lock.lock();
        try {
            System.out.println("Viber UP");
            Thread.sleep(2000);
            System.out.println("Viber DOWN");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void telegram() {
        lock.lock();
        try {
            System.out.println("Telegram UP");
            Thread.sleep(4000);
            System.out.println("Telegram DOWN");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
