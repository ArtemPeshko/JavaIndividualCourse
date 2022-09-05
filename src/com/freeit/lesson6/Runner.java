package com.freeit.lesson6;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Artem Peshko on 22.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    static String name;
    static String description;
    static String signature;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Note[] noteBooks = new Note[3];
        fillArray(noteBooks);
        printArray(noteBooks);
        changeNote(noteBooks);
        printArray(noteBooks);
    }

    private static void fillArray(Note[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите называние записи " + (i + 1));
            name = scanner.nextLine();
            System.out.println("Введите описание записи " + (i + 1));
            description = scanner.nextLine();
            System.out.println("Введите подпись " + (i + 1));
            signature = scanner.nextLine();
            array[i] = createNote(name, description, signature);
        }
    }

    private static void changeNote(Note[] array) {
        System.out.println("Какую запись изменить");
        int index = scanner.nextInt();
        System.out.println("Введите называние записи ");
        name = scanner.nextLine();
        System.out.println("Введите описание записи ");
        description = scanner.nextLine();
        System.out.println("Введите подпись ");
        signature = scanner.nextLine();
        array[index - 1] = createNote(name, description, signature);
    }

    private static Note createNote(String name,String description, String signature) {
        return new Note(name, new Date(), description, signature);
    }

    private static void printArray(Note[] array) {
        for (Note noteBook : array) {
            System.out.println(noteBook);
        }
    }
}
