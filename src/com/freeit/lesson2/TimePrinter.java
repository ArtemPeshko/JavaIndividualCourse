package com.freeit.lesson2;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 01.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class TimePrinter {
    public static void main(String[] args) {
     /*   ������� 4500 ������. ������� � ������� ������������ � ���� ���������� ������:
        �) ����� + ������,
        �) ����� + ����� + ������,
        �) ���� + ����� + ����� + ������,
        D) ������ + ���� + ����� + ����� + ������.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �����");

        int s = scanner.nextInt();
        int seconds = s % 60;
        int m = (s - seconds) / 60;
        int minutes = m % 60;
        int h = (m - minutes) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int weeks = (d - days) / 7;

        //A
        System.out.println("� " + s + ": " + m + " ����� " + seconds + " ������.");
        //B
        System.out.println("� " + s + ": " + h + " ����� " + minutes + " ����� " + seconds + " ������.");
        //C
        System.out.println("� " + s + ": " + d + " ���� " + hours + " ����� " + minutes + " ����� " + seconds + " ������.");
        //D
        System.out.println("� " + s + ": " + weeks + " ������ " + days + " ���� " + hours + " ����� " + minutes + " ����� " + seconds + " ������.");

        scanner.close();
    }
}
