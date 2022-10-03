package com.freeit.lesson15.collections;

import com.freeit.lesson11.implementation.LgTvRemote;
import com.freeit.lesson11.implementation.Remote;
import com.freeit.lesson11.implementation.SamsungTvRemote;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Artem Peshko on 26.09.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class CollectionRunner {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("Element");
//        list.add("Element1");
//        list.add("Element2");
//        list.add("Element3");
//        list.forEach(System.out::println);

        LinkedList<Remote> linkedList = new LinkedList<>();
        linkedList.add(new LgTvRemote());
        linkedList.add(new SamsungTvRemote());

        linkedList.forEach(System.out::println);
    }
}
