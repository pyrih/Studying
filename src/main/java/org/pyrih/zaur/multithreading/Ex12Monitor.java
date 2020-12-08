package org.pyrih.zaur.multithreading;

public class Ex12Monitor {

    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Mobile());
        Thread t2 = new Thread(new Skype());
        Thread t3 = new Thread(new Viber());

        t3.start();
        t2.start();
        t1.start();


    }

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call is started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call is finished");

        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call is started");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call is finished");

        }
    }

    void viberCall() {
        synchronized (lock) {

            System.out.println("Viber call is started");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Viber call is finished");

        }
    }

}

class Mobile implements Runnable {
    @Override
    public void run() {
        new Ex12Monitor().mobileCall();
    }
}

class Skype implements Runnable {
    @Override
    public void run() {
        new Ex12Monitor().skypeCall();
    }
}

class Viber implements Runnable {
    @Override
    public void run() {
        new Ex12Monitor().viberCall();
    }
}
