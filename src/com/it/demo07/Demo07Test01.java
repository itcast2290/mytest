package com.it.demo07;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo07Test01 {

    public static void main(String[] args) {


        Arrays.stream(args).forEach(System.out::println);

        ArrayList<String> objects = new ArrayList<>();
        objects.add("12");
        objects.add(1, "34");
        int size1 = objects.size();

        System.out.println(size1);
        System.out.println(objects);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("12");
        arrayList.add(1, "34");
        arrayList.add(1, "56");
        int size = arrayList.size();

        System.out.println(size);
        System.out.println(arrayList);
    }
}
