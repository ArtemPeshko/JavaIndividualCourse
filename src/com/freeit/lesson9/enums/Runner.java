package com.freeit.lesson9.enums;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 05.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {

        Months[] values = Months.values();

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите номер мес€ца");
        int month = scanner.nextInt();

        Months monthByOrdinal = Months.getMonthByOrdinal(month);

        monthByOrdinal.runTasks();
    }
}
