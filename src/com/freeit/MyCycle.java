package com.freeit;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Artem Peshko on 17.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class MyCycle {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputLine = scanner.nextLine();
//
//        String[] array = inputLine.split("\\s");

        String[] array = {"I", "love", "love", "you", "so", "so", "much", ",", "my", "love", "my", "Soul", "!"};
        String[] result = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            int wordSum = 0;
            for (String s : array) {
                if (array[i].equals(s)) {
                    wordSum++;
                }
            }
            result[i] = "Word: " + array[i] + " repeat: " + wordSum + " times";
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                for (int j = i + 1; j < result.length; j++) {
                    if (result[i].equals(result[j])) {
                        result[j] = null;
                    }
                }
            }
        }
        for (String s : result) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
