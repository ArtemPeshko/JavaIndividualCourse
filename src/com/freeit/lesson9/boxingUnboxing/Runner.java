package com.freeit.lesson9.boxingUnboxing;

/**
 * Created by Artem Peshko on 05.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    private static int j;
    private static Integer i;
    private static Long l;
    private static Double d;
    private static Float f;

    public static void main(String[] args) {

        int ex = 5;
        Integer ex2 = null;

        Integer i2 = ex;

        int j2 = ex2;
        

        System.out.println(j2);

    }


    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Runner.j = j;
    }

    public static Integer getI() {
        return i;
    }

    public static void setI(Integer i) {
        Runner.i = i;
    }

    public static Long getL() {
        return l;
    }

    public static void setL(Long l) {
        Runner.l = l;
    }

    public static Double getD() {
        return d;
    }

    public static void setD(Double d) {
        Runner.d = d;
    }

    public static Float getF() {
        return f;
    }

    public static void setF(Float f) {
        Runner.f = f;
    }


}
