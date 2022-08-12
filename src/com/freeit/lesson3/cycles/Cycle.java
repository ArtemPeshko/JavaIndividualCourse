package com.freeit.lesson3.cycles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Artem Peshko on 08.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Cycle {
    //
    public static void main(String[] args) {

        //начало итерации; условие до которого будет работать цикл; изменение шага цикла

//        int i = 0;
//
//        for ( ; i < 10 ; ) {
//            System.out.println("Result " + i);
//            i++;
//        }

        List<String> list = new ArrayList<>();
        list.add("Artem");
        list.add("Midzu");
        list.add("Reidenshi");

//        for (int i1 = 0; i1 < list.size(); i1++) {
//            System.out.println(list.get(i1));
//        }
//
//        for (String name : list) {
//            System.out.println(name);
//        }

        // list.forEach(System.out::println);

//        for (int i = 0; i <= 10; i++) {
//            System.out.println("result from I " + i);
//            for (int j = 0; j <= 10; j++) {
//                System.out.println("result from J " + j);
//            }
//        }

//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Делится без остатка на 3 " + i);
//                continue;
//            }
//            if (i % 4 == 0) {
//                System.out.println("Делится без остатка на 3 " + i);
//                break;
//            }
//            if (i % 5 == 0) {
//                System.out.println("Делится без остатка на 3 " + i);
//                continue;
//            }
//            System.out.println("Some result " + i);
//        }

        // while() and do-while()
        // while() - проверяет условия - потом выполняет
        // do-while() - сначала выполняет, потом проверяет

        int i = 1;
        int j = 1;

        while (i > 10) {
            System.out.println("In cycle ");
        }

        System.out.println("\n");

        do {
            System.out.println("In cycle DO ");
        } while (i > 10);
    }
}
