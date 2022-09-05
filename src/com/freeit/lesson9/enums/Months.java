package com.freeit.lesson9.enums;

import javax.swing.plaf.TableHeaderUI;
import java.util.Arrays;

/**
 * Created by Artem Peshko on 05.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public enum Months {
    JANUARY(1, "������", new Thread(() -> {
        System.out.println("������");
        for (int i = 0; i < 4; i++) {
            System.out.println("���� ����");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    })),
    FEBRUARY(2, "�������", null),
    MARCH(3, "����", null),
    APRIL(4, "������", null),
    MAY(5, "���", null),
    JUNE(6, "����", null),
    JULY(7, "����", null),
    AUGUST(8, "������", null),
    SEPTEMBER(9, "��������", null),
    OCTOBER(10, "�������", null),
    NOVEMBER(11, "������", null),
    DECEMBER(12, "�������", null);

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
                .orElseThrow(() -> new IllegalArgumentException("��� ������ � ����� �������� " + ordinal));
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
