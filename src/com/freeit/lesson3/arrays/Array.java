package com.freeit.lesson3.arrays;

import java.util.*;

/**
 * Created by Artem Peshko on 08.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Array {
    public static void main(String[] args) {

        // структура данный, каждая ячейка которого соответствует какому-то типу данных.

     //   Integer[] arr = new Integer[10]; //int 0
//        double[] d = new double[12]; // 100.50 - null
//        String[] strg = new String[10]; // null
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] tmp;
//        strg[0] = "Artem";
//
//        d[0] = 0.2;
//        //0-9
//        arr[1] = 99; //int = 99
//        arr[0] = 20;
//
        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//        }
//        for (Integer j : arr) {
//            System.out.println(j);
//        }

//        int[][] array = new int[10][];
//
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new int[random.nextInt(10) + 3];
//        }
//
//        for (int j = 0; j < array.length; j++) { // 1. Идем в цикле по массиву, каждый элемент которого массив int (int[])
//            for (int i = 0; i < array[j].length; i++) { // 2. берем массив int (int[]) идем по нему в цикле
//                array[j][i] = random.nextInt(500) + 5; // 3. каждому элементу массива присваиваем значение
//            }
//        }
//
//        for (int[] arrayInt : array) {
//            for (int element : arrayInt) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }


        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                array[i][i1] = random.nextInt(10) + 10;
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
