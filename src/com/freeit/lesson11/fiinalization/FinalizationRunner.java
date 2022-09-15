package com.freeit.lesson11.fiinalization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class FinalizationRunner {
//    public final static List<SimpleObject> objList = new ArrayList<>();

    public static void main(String[] args) {
        List<SimpleObject> soList = new ArrayList<>();

        for (int i = 0; i < 2_500_000; i++) {
            createObject(i);
        }
    }

    private static SimpleObject createObject(int number) {
        return new SimpleObject("so" + number);
    }
}
