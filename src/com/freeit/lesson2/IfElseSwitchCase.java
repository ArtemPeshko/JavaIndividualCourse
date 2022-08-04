package com.freeit.lesson2;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 04.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class IfElseSwitchCase {

    public static void main(String[] args) {

        // if(условие){}; if(условие){} else {}; if(условие){} else if(условие){} else {};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели (число от 1 до 7)");
        int dayOfWeek = scanner.nextInt();

        //switch case
        switch (dayOfWeek) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Нет такого дня недели");
        }

        scanner.close();

    }

}
