package com.freeit.lesson10.inheritance;

/**
 * Created by Artem Peshko on 17.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Pet extends Animal{
    private String breed;

    public Pet(String environment, String breed) {
        super(environment);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Pet can eat");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                '}' + super.toString();
    }
}
