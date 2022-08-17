package com.freeit.lesson5;

/**
 * Created by Artem Peshko on 15.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Person {
    private String name;
    private int age;
    private final int birthYear;

    public Person(String name, int age, int birthYear) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
    }

    public void voice() {
        System.out.println("Make some sound!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
