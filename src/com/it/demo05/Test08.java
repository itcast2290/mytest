package com.it.demo05;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test08 {
    public static void main(String[] args) {
        int i = 129;
        int j = 129;
        Integer b = 11;
        ArrayList<Object> array = new ArrayList<>();
        array.add(i);
        array.add(j);
        System.out.println("" + (array.get(0) == array.get(1)));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
