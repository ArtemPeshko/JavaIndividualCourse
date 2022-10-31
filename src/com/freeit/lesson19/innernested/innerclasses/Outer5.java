package com.freeit.lesson19.innernested.innerclasses;

public class Outer5 {
    private int anInt = 5;

    public void method() {

        final int x = 3;

        class Inner1 {
            void print() {
                System.out.println("Inner1");
                System.out.println("x=" + x);
                System.out.println(anInt);
            }
        }

        Inner1 obj = new Inner1();
        obj.print();
    }

}
