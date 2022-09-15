package com.freeit.lesson11.implementation;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class ConditionerRemote implements Remote {

    private int currentTemp;

    public ConditionerRemote(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public void turnOn() {
        System.out.println("Conditioner is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Conditioner is turning OFF");
    }

    public void riseTmt() {
        currentTemp++;
    }

    public void downTmt() {
        currentTemp--;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }
}
