package com.freeit.lesson10;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Modifiers {
    public int i;  // -> видны всем
    protected int b; // -> в пакете и наследникам
    int t;  //default, package-private, friendly -> в пакете
    private int v; // -> не виден никому


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
