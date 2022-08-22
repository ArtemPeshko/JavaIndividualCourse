package com.freeit.lesson2;

/**
 * Created by Artem Peshko on 22.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Arrays {
    public static void main(String[] args) {

        int[][] someArray = new int[3][3];

        someArray[1][2] = 9;

        for (int i = 0; i < someArray.length; i++) {
            for (int i1 = 0; i1 < someArray[i].length; i1++) {
                System.out.print(someArray[i][i1]);
            }
            System.out.println();
        }



    }
}
