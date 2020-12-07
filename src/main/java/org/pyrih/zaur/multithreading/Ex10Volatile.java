package org.pyrih.zaur.multithreading;

public class Ex10Volatile extends Thread{

    volatile boolean b = true; // не сохраняется значение в кэш поцессора. Работает если только один из потоков меняет значение переменной!!

    @Override
    public void run() {
        long a = 0L;

        while (b) {
            a++;
        }
        System.out.println("The loop is done. Counter: " + a);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex10Volatile t = new Ex10Volatile();
        t.start();

        Thread.sleep(1_000);

        System.out.println("After one second is time to wake up...");

        t.b = false;
        t.join();

        System.out.println("The main is done!");
    }
}
