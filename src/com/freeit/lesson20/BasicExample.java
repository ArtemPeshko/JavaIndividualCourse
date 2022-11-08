package com.freeit.lesson20;

import com.freeit.lesson6.Note;

import java.util.Comparator;

import static java.lang.Thread.sleep;

public class BasicExample {
    public static void main(String[] args) throws InterruptedException {

//        MyNewThread2 myRunnable = new MyNewThread2();
//        Thread myThread2 = new Thread(myRunnable);
//        myThread2.setName("Runnable tread");
//        myThread2.start();
//
//        Thread myThread = new MyNewThread();
//        myThread.setName("Thread thread");
//        myThread.start();

        new Thread(() -> {
            int i = 0;
            while (i < 10) {
                System.out.println("from " + Thread.currentThread().getName() + " thread...");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }).start();

        // System.out.println("Program finished");
    }
}
