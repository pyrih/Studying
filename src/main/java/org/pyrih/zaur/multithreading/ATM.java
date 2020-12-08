package org.pyrih.zaur.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        new Employee("Kate", lock);
        new Employee("Andrew", lock);
        new Employee("John", lock);
        new Employee("Dmytro", lock);
        new Employee("Hanna", lock);
    }

}

class Employee extends Thread {
    String name;
    Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        System.out.println(name + " waiting...");
        lock.lock();
        System.out.println(name + " uses atm...");
        try {
            Thread.sleep(1_000);
            System.out.println(name + " have done to use atm");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
