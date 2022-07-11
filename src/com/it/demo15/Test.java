package com.it.demo15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        String[] strings1 = {"aaaa", "aaaa", "bbbbb", "bbbb"};
        List<String> strings = Arrays.asList(strings1);
        strings.set(1, "cccc");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("");
        int index = 0;
        int[] ints = new int[8];
        ints[0] = 1;
        ints[index++] = 5;
        ints[++index] = 6;
        List<Integer> collect = IntStream.of(ints).boxed().collect(Collectors.toList());
        System.out.println(collect);

    }
}
