package com.freeit.lesson10.overload;

import java.util.Date;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class DataPrinter {

    public void printDate(String string) {
        System.out.println("String parameter");
    }

    public void printDate(int day, int month, int year) {
        System.out.println("int int int parameter");
    }

    public void printDate(Date date) {
        System.out.println("Date parameter");
    }

    public void printDate(Object object) {
        System.out.println("Object parameter");
    }

    public void printDate(Exception exception) {
        System.out.println("Exception parameter");
    }

    public void printDate(int first, int second, int... ints) {
        System.out.println("Var count parameters");
    }
}