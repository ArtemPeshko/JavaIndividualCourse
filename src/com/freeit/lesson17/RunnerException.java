package com.freeit.lesson17;

import java.io.ByteArrayInputStream;
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

        System.out.println("Inter delimiter ");
        int delimiter = new Scanner(System.in).nextInt();
        int rate = 100;

        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[10])){
            delimiter(rate, delimiter);
        } catch (ZeroException | ArithmeticException e) {
            System.out.println("�� ����� ������ �� 0? " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("�� ����� ������ �� 0? " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("���-�� ����� �� ���: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("");
        }

//        for (int i = 0; i <= array.length; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("���� " + array[i]);
//        }

        System.out.println("��������� ����������� �������");
    }

    private static void delimiter(int rate, int delimiter) throws ZeroException {
//        for (int i = 5; i >= 1; i--) {
//            Thread.sleep(800);
//            System.out.println("�� �������� ��������� �������� " + i);
//        }
       // delimiter2(rate, delimiter);
//        if (delimiter == 0) {
//            throw new ZeroException("You divider is equal to zero. Please choose another one gr than 0");
//        }
        System.out.println("��� �������� ���������� = " + (rate / delimiter));
    }



//    private static void delimiter2(int rate, int delimiter) throws ZeroException {
//        if (delimiter == 0) {
//            throw new ZeroException("You divider is equal to zero. Please choose another one gr than 0");
//        }
//    }
//    public static void main(String[] args) {
//        int[] array = new int[5];
//        Thread thread = new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Server is working");
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();
//
////        for (int i = 0; i <= array.length; i++) {
////            Thread.sleep(1000);
////            System.out.println("���� " + array[i]);
////        }
//        System.out.println("Inter delimiter ");
//        int delimiter = new Scanner(System.in).nextInt();
//        int rate = 100;
//        try {
//            delimiter(rate, delimiter);
//        } catch (InterruptedException | ZeroException e) {
//            System.out.println("���-�� ����� �� ��� " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            System.out.println("��������� ����������� �������");
//        }
//    }
//
//    private static void delimiter(int rate, int delimiter) throws InterruptedException, ZeroException {
//        for (int i = 5; i >= 1; i--) {
//            Thread.sleep(800);
//            System.out.println("�� �������� ��������� �������� " + i);
//        }
//        if (delimiter == 0 ) {
//            throw new ZeroException("You divider is equal to zero. Please choose another one gr than 0");
//        }
//        System.out.println("��� �������� ���������� = " + (rate / delimiter));
//    }
}
