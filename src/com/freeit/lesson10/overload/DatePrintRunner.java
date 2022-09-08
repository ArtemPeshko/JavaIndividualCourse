package com.freeit.lesson10.overload;

import java.util.Date;

/**
 * Created by Artem Peshko on 19.07.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class DatePrintRunner {
    public static void main(String... args) {
        DataPrinter dataPrinter = new DataPrinter();
        dataPrinter.printDate(2022, 9, 8);
    }
}
