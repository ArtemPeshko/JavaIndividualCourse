package com.freeit.lesson11.initialization;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class InitializationRunner {

    public static void main(String[] args) {
        Child child = new Child();
    }

    //P - static var
    //P - static init block
    //C - static var
    //C - static init block
    //P - non-static var
    //P - non-static init block
    //P - constructor
    //C - non-static var
    //C - non-static init block
    //C - constructor
}