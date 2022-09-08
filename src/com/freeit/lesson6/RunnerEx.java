package com.freeit.lesson6;

import java.util.Scanner;

/**
 * Created by Artem Peshko on 05.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class RunnerEx {

    static String name;
    static int age;
    static boolean canSpeak;
    static boolean canWalk;
    static boolean canSee;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите име");
        name = scanner.nextLine();
        System.out.println("Введите возраст");
        age = scanner.nextInt();
        System.out.println("Есть проблемы с речью? (1 - да, 0 - нет)");
        canSpeak = checkResult(scanner.nextInt());
        System.out.println("Есть проблемы с ходьюой? (1 - да, 0 - нет)");
        canWalk = checkResult(scanner.nextInt());
        System.out.println("Есть проблемы со зрением? (1 - да, 0 - нет)");
        canSee = checkResult(scanner.nextInt());

        Person person = new Person(name, age, canSpeak, canWalk, canSee);

    }

    private static boolean checkResult(int result) {
        return result == 0;
    }
}
