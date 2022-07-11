package com.it.demo16;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1111");
        strings.add("2222");
        strings.add("3333");
        strings.add("4444");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
