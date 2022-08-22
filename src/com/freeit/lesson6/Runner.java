package com.freeit.lesson6;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

/**
 * Created by Artem Peshko on 22.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {
        Note[] noteBooks = new Note[3];

        Scanner scanner = new Scanner(System.in);
        String name;
        String description;
        String signature;

        for (int i = 0; i < noteBooks.length; i++) {
            System.out.println("������� ��������� ������ " + (i + 1));
            name = scanner.nextLine();
            System.out.println("������� �������� ������ " + (i + 1));
            description = scanner.nextLine();
            System.out.println("������� ������� " + (i + 1));
            signature = scanner.nextLine();

            noteBooks[i] = new Note(name,
                    new Date(),
                    description,
                    signature);
        }
        for (int i = 0; i < noteBooks.length; i++) {
            System.out.println(noteBooks[i]);
        }

        System.out.println("����� ������ ��������");
        int index = scanner.nextInt();
        System.out.println("������� ��������� ������ " );
        name = scanner.nextLine();
        System.out.println("������� �������� ������ " );
        description = scanner.nextLine();
        System.out.println("������� ������� " );
        signature = scanner.nextLine();

        noteBooks[index] = new Note(name, new Date(), description, signature);

        for (int i = 0; i < noteBooks.length; i++) {
            System.out.println(noteBooks[i]);
        }
    }
}
