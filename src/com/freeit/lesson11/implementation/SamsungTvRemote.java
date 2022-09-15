package com.freeit.lesson11.implementation;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class SamsungTvRemote extends TvRemote {
    @Override
    protected void chooseInput() {
        System.out.println("Input type: \n HDMI \n AV \n TV");
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung tv turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung tv turned off");
    }
}
