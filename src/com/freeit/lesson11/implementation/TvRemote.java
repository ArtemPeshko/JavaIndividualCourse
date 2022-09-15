package com.freeit.lesson11.implementation;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public abstract class TvRemote implements Remote{

    protected abstract void chooseInput();

    void channelPlus() {
        System.out.println("channel +");
    }

    void channelMinus() {
        System.out.println("channel -");
    }

}
