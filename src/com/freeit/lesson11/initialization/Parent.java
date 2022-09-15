package com.freeit.lesson11.initialization;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Parent {

    static int a = 1; // Parent.a;
    static int b;
    int c = 3;
    int d;
    final int e = 5;
    final int f; // new Parent() -> must be init

    static {
        System.out.println("from Parent static block. a = " + a
                + " and b = " + b);
        b = 2;
        System.out.println("a = " + a + " and b = " + b);
    }

    {
        System.out.println("from Parent NON static block. c = "
                + c + " and d = " + d + " and e = " + e
                + " and f = " /*+ f*/);
        d = 4;
        f = 6;
        System.out.println("c = " + c + " and d = " + d
                + " and e = " + e + " and f = " + f);
    }

    public Parent() {
        System.out.println("Parent constructor");
        System.out.println("a=" + a + ", b=" + b + ", c=" + c
                + ", d=" + d + ", e=" + e + ", f=" + f);
    }
}