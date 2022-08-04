package com.freeit.lesson2;

/**
 * Created by Artem Peshko on 21.06.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class JavaTypes {
    static int minutePerHour = 100;

    public static void main(String[] args) {
        // Numeric
        byte b = (byte) 128;     // -128 - 127  (8 bit)
        short s = 5;             // -32768 - 32767  (16 bit)
        int i = 5;               // -2147483648 - 2147483647  (32 bit)
        long l =  2147483649L;   // -9223372036854775808 - 9223372036854775808  (64 bit) значение по умолчанию 0L
        float f = 0.5f;          // -3.4E+38 - 3.4E+38  (32 bit) значение по умолчанию 0f
        double d = 0.5;          // -1.7E+308 - -1.7E+308  (64 bit) значение по умолчанию 0d


        //переменная это выделенная ячейка в области памяти.
        // minutePerHour

        // Characters
        char c = '!';            // '\u0000' = int 0 - '\uffff' = int 65535 (16 bit)
        char c2 = 87;

        // Logical
        boolean tb = true;
        boolean fb = false;

        // Strings
        String hello = "Hello";
        String world = "world";

        String result = hello + " " + world;

        System.out.println(result);
    }
}
