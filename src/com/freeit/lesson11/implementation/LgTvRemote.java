package com.freeit.lesson11.implementation;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class LgTvRemote extends TvRemote implements MagicRemote{

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected void chooseInput() {

    }

    @Override
    void channelPlus() {
        System.out.println("LG TV channel PLUS");
    }

    @Override
    void channelMinus() {
        System.out.println("LG TV channel MINUS");
    }

    @Override
    public void turnOn() {
        System.out.println("LG TV is turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV is turning OFF");
    }

    @Override
    public void sayHello() {
        System.out.println("method override");
    }

    @Override
    public void showCursor() {
        System.out.println("cursor");
    }

//    @Override
//    public void chooseDimension() {
//        System.out.println("LG TV choose dimension: ....");
//    }
}
