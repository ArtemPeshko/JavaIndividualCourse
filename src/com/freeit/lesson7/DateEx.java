package com.freeit.lesson7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Artem Peshko on 25.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class DateEx {
    public static void main(String[] args) {
//        Date date = new Date();
//        Date date1 = new Date();
//        long time = date.getTime();
//
//        boolean after = date.after(date1);
//
//        System.out.println(date);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm", Locale.ROOT);
        String ownDate = "25.08.2022 20:46";


//        LocalDateTime localDateTime = LocalDateTime.parse(ownDate, dateTimeFormatter);
//
//        System.out.println(localDateTime);
//        System.out.println(dateTimeFormatter.format(localDateTime));

        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 8, 25, 20, 57);
        System.out.println(localDateTime1);
        System.out.println(dateTimeFormatter.format(localDateTime1));

    }
}
