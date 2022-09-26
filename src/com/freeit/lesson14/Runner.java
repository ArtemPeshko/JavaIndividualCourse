package com.freeit.lesson14;


import com.freeit.lesson6.Note;

/**
 * Created by Artem Peshko on 26.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Runner {
    public static void main(String[] args) {
        Box<String> box = new Box<>(new String[10]);
        box.addToBox("Element1");
        box.addToBox("Element2");
        box.addToBox("Element3");
        box.addToBox("Element4");


        Box<Number> boxLong = new Box<>(new Number[10]);
        boxLong.addToBox(1L);
        boxLong.addToBox(3L);
        boxLong.addToBox(4L);

        //BoxUtils.allCreatedBox(new Box[]{box, boxLong});
        //BoxUtils.printCreatedBox(boxLong);
        System.out.println(BoxUtils.getBoxOccupiedSlotsNumber(box));
        System.out.println(BoxUtils.getBoxOccupiedSlotsNumber(boxLong));
    }
}
