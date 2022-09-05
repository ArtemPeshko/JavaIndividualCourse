package com.freeit.lesson6;

import java.util.Date;

/**
 * Created by Artem Peshko on 05.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class RunnerEx {

    public static void main(String[] args) {

        Note note = new Note();

        Note note1 = new Note("name", new Date(), "description", "signature");

        Note note2 = new Note("name", "description", "signature");

    }
}
