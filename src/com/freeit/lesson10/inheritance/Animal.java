package com.freeit.lesson10.inheritance;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Animal {
    public Animal(String environment) {
        this.environment = environment;
    }

    private String environment;

    public void eat() {
        System.out.println("all animals can eat");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "environment='" + environment + '\'' +
                '}';
    }
}