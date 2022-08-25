package com.freeit.lesson7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Artem Peshko on 25.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class ArraysEx {
    public static void main(String[] args) {

        Integer[] arrayEx = {1, 21, 32, 5, 67, 7, 8, 92, 3, 6, 8, 10};
        int[] arraySec = {1, 21, 32, 5, 67, 72, 8, 92, 3, 16, 83, 10};

        Arrays.sort(arrayEx);

        boolean contains = Arrays.asList(arrayEx).contains(7);

        System.out.println(contains);

    }
}
