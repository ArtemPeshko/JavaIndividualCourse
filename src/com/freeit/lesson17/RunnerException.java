package com.freeit.lesson17;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 17.10.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class RunnerException {
    public static void main(String[] args) {
        int[] array = new int[5];
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Server is working");
            }
        });
        thread.setDaemon(true);
        thread.start();

//        for (int i = 0; i <= array.length; i++) {
//            Thread.sleep(1000);
//            System.out.println("цикл " + array[i]);
//        }
        System.out.println("Inter delimiter ");
        int delimiter = new Scanner(System.in).nextInt();
        int rate = 100;
        try {
            delimiter(rate, delimiter);
        } catch (InterruptedException | ZeroException e) {
            System.out.println("Что-то пошло не так " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Программа выполнилась успешно");
        }
    }

    private static void delimiter(int rate, int delimiter) throws InterruptedException, ZeroException {
        for (int i = 5; i >= 1; i--) {
            Thread.sleep(800);
            System.out.println("До подсчета резултата осталось " + i);
        }
        if (delimiter == 0 ) {
            throw new ZeroException("You divider is equal to zero. Please choose another one gr than 0");
        }
        System.out.println("Ваш полезный коофициент = " + (rate / delimiter));
    }
}
