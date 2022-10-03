package com.freeit.lesson15.collections;

import com.freeit.lesson11.implementation.LgTvRemote;
import com.freeit.lesson11.implementation.Remote;
import com.freeit.lesson11.implementation.SamsungTvRemote;
import com.freeit.lesson6.Note;

import java.util.*;
import java.util.stream.Collectors;

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

//        LinkedList<Remote> linkedList = new LinkedList<>();
//        linkedList.add(new LgTvRemote());
//        linkedList.add(new SamsungTvRemote());
//
//        linkedList.forEach(System.out::println);

//
        Set<Note> set = new HashSet<>();

        set.add(new Note("audi"));
        set.add(new Note("renault"));
        set.add(new Note( "bmw"));
        set.add(new Note("mercedes"));
        set.add(new Note("mercedes"));

        System.out.println(set);

        // key - value


        Map<Date, List<Note>> map = new HashMap<>();

        List<Note> notes = new ArrayList<>();

        Note note = new Note("audi");
        notes.add(note);


        map.put(new Date(), notes);

//        map.put(2, note);
//        map.put(3, note);
//        map.put(4, note);
//
        map.forEach((k, v) -> {
            if (k.compareTo(new Date()) == 0) {
                v.add(new Note());
                v.remove(2);
            }
        });

        Map<Note, Object> noteObjectMap = new HashMap<>();

        Object mutex = new Object();

        noteObjectMap.put(note, mutex);
        noteObjectMap.put(note, mutex);
        noteObjectMap.put(note, mutex);
        noteObjectMap.put(note, mutex);
        noteObjectMap.put(note, mutex);

    }
}
