package com.freeit.lesson20.synchroniation.old;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class CounterRunner {
    public static ReentrantLock lock = new ReentrantLock();
    public static AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {

        Object ballForAction = new Object();

        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                lock.lock();
                String name = Thread.currentThread().getName();
                counter.count = 1;
                for (int j = 0; j < 5; j++) {
                    System.out.printf("Thread %s modified counter. Current count = %d, ineration: %d \n", name, counter.count, j);
                    counter.increment();
                }
                letOtherThreadsIn();
            }).start();
        }
    }

    private static void letOtherThreadsIn() {
        System.out.println(Thread.currentThread().getName() + " finished with incrementing");
        lock.unlock();
    }
}