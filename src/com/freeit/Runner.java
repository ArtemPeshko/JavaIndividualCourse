package com.freeit;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 11.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
        String m = "m";
        System.out.println("Enter your gender (m or f) : ");
        String gender = scanner.nextLine();
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
        boolean res = m.equals(gender);
        System.out.println(res);

//        if("m".equals(gender.toLowerCase())){
//            if (age < 18 ) {
//                System.out.println("Hello boy " + name);
//            } else {
//                System.out.println("Hello Mr." + name);
//            }
//        } else if ("f".equals(gender.toLowerCase())){
//            if (age < 18 ) {
//                System.out.println("Hello girl " + name);
//            } else {
//                System.out.println("Hello Mrs." + name);
//            }
//        } else {
//            System.out.println("Entered incorrect gender.");
//        }
    }
}
