package com.freeit.lesson2;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 04.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class IfElseSwitchCase {

    public static void main(String[] args) {

        // if(�������){}; if(�������){} else {}; if(�������){} else if(�������){} else {};

        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ���� ������ (����� �� 1 �� 7)");
        int dayOfWeek = scanner.nextInt();

        //switch case
        switch (dayOfWeek) {
            case 1 -> System.out.println("�����������");
            case 2 -> System.out.println("�������");
            case 3 -> System.out.println("�����");
            case 4 -> System.out.println("�������");
            case 5 -> System.out.println("�������");
            case 6 -> System.out.println("�������");
            case 7 -> System.out.println("�����������");
            default -> System.out.println("��� ������ ��� ������");
        }

        scanner.close();

    }

}
