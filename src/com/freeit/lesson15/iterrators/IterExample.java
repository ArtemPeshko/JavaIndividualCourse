package com.freeit.lesson15.iterrators;

import java.util.*;

public class IterExample {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            intList.add(i + 1);
            map.put(i + 1, i + 1);
        }

        System.out.println(intList);
        System.out.println(map);

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (key % 3 == 0) {
                iterator.remove();
            }
        }

//        for (int i = intList.size() - 1; i >= 0; i--) {
//            if(intList.get(i) % 2 == 0) {
//                intList.remove(i);
//            }
//        }
//
//        System.out.println(intList);

//        intList.forEach(value -> {
//            if(value % 2 == 0) {
//                intList.remove(value);
//            }
//        });
//
//        System.out.println(intList);


//        Iterator<Integer> iterator = intList.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(intList);

//        Iterator<Integer> iterator = intSet.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(intSet);

//        Set<Integer> keys = intMap.keySet();
//        Iterator<Integer> keysIterator = keys.iterator();
//        while (keysIterator.hasNext()) {
//            Integer key = keysIterator.next();
//            System.out.print(key);
//            System.out.println(intMap.get(key));
//        }

//        Set<Map.Entry<Integer, Integer>> entries = intMap.entrySet();
//        Iterator<Map.Entry<Integer, Integer>> entriesIterator = entries.iterator();
//        while (entriesIterator.hasNext()) {
//            System.out.println(entriesIterator.next());
//        }
    }
}
