package com.freeit.lesson16.compare;

import java.util.Comparator;

public class Fizruk implements Comparator<User>{

    @Override
    public int compare(User user, User user1) {
        return user.getName().length() - user1.getName().length();
    }
}
