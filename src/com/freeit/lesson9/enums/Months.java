package com.freeit.lesson9.enums;

import javax.swing.plaf.TableHeaderUI;
import java.util.Arrays;

/**
 * Created by Artem Peshko on 05.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public enum Months {
    JANUARY(1, "Январь", new Thread(() -> {
        System.out.println("Январь");
        for (int i = 0; i < 4; i++) {
            System.out.println("Идет снег");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    FEBRUARY(2, "Февраль", null),
    MARCH(3, "Март", null),
    APRIL(4, "Апрель", null),
    MAY(5, "Май", null),
    JUNE(6, "Июнь", null),
    JULY(7, "Июль", null),
    AUGUST(8, "Август", null),
    SEPTEMBER(9, "Сентябрь", null),
    OCTOBER(10, "Октябрь", null),
    NOVEMBER(11, "Ноябрь", null),
    DECEMBER(12, "Декабрь", null);

    private final int ordinal;
    private final String description;
    Thread thread;

    Months(int ordinal, String description, Thread thread) {
        this.ordinal = ordinal;
        this.description = description;
        this.thread = thread;
    }

    public static Months getMonthByOrdinal(int ordinal) {
        return Arrays.stream(Months.values())
                .filter(index -> index.ordinal == ordinal)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Нет месяца с таким индексом " + ordinal));
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getDescription() {
        return description;
    }

    public void runTasks() {
        thread.start();
    }
}
