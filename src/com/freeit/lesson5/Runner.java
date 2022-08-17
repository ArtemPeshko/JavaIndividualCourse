package com.freeit.lesson5;

/**
 * Created by Artem Peshko on 15.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {

        Person person = new Person("Midzu", 18, 1993);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getBirthYear());
    }

}
