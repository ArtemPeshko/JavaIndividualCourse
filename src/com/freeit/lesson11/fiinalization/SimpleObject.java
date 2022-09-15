package com.freeit.lesson11.fiinalization;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class SimpleObject{
    private String name;

    public SimpleObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "'s finalization");
        super.finalize();
    }
}