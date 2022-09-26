package com.freeit.lesson14;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Artem Peshko on 26.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class BoxUtils {
    public static void allCreatedBox(Box<?>[] boxes) {
        Arrays.stream(boxes).forEach(element -> Arrays.stream(element.getAll())
                .filter(Objects::nonNull)
                .forEach(System.out::println));
    }

    public static void printCreatedBox(Box<?> box) {
        Arrays.stream(box.getAll()).forEach(System.out::println);
    }

    public static long getBoxOccupiedSlotsNumber(Box<?> box) {
        return Arrays.stream(box.getAll()).filter(Objects::nonNull).count();
    }
}
