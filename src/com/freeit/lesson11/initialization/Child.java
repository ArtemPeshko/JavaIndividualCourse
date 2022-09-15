package com.freeit.lesson11.initialization;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Child extends Parent{

    static int g = 1;
    static int h;
    int i = 3;
    int j;
    final int k = 5;
    final int l;

    static {
        System.out.println("from Child static block. g = "
                + g + " and h = " + h);
        h = 2;
        System.out.println("g = " + g + " and h = "
                + h);
    }

    {
        System.out.println("from Child NON static block. i = "
                + i + " and j = " + j + " and k = " + k
                + " and l = " /*+ l*/);
        j = 4;
        l = 6;
        System.out.println("i = " + i + " and j = " + j
                + " and k = " + k + " and l = " + l);
    }

    public Child() {
        System.out.println("Child constructor");
        System.out.println("g=" + g + ", h=" + h + ", i=" + i
                + ", j=" + j + ", k=" + k + ", l=" + l);
    }
}
