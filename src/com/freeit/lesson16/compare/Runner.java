package com.freeit.lesson16.compare;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //Comparable - сравнибельный
        //Comparator - то, что сравниет один объект с другим

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            String uuid = UUID.randomUUID().toString();
            users.add(new User(uuid.charAt(i + 1) +
                    "_user" + uuid.substring(0, new Random().nextInt(uuid.length()))));
        }

        for (User user : users) {
            System.out.println(user.getName());
        }

        Collections.sort(users, (User user, User user1) -> user.getName().length() - user1.getName().length());

        System.out.println("--------------------SORTED LIST------------------------");


        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}
