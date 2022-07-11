package com.it.demo13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    volatile int a = 2;
    volatile Demo demo = new Demo();

    AtomicInteger atomicInteger = new AtomicInteger(1);

    AtomicInteger atomicInteger02 = new AtomicInteger(1);
    public static void main(String[] args) {
        // Test test = new Test();
        // test.Test01();
        // Test005();
        Test006();

    }

    public static void Test006() {
        float b = 5.33f;
        double d = 3.44;
        int a = -13;
        int e = 13;
        int c = -2;
        int f = 2;
        System.out.println(b % c);
        System.out.println(d % c);
        System.out.println(a % c);
        System.out.println(e % c);
        System.out.println(a % f);
    }

    public static void Test005() {
        float b = 1.33f;
        double d = 2.44;
        BigDecimal bigDecimal = new BigDecimal("1.334");
        System.out.println(b / (-1));
        System.out.println(d / (-1));
        System.out.println(bigDecimal.divide(new BigDecimal(-1)));
        BigInteger bigInteger = new BigInteger("11111");
        System.out.println(bigInteger.divide(new BigInteger("-1")));
    }

    public void Test00() {
        int[] b = new int[2];
        int length = b.length;

        int d = 4;
        int o = 5;

        int sum = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        String f = "f";
        arrayList.add(f);
        int finalSum = sum;
        arrayList.forEach(e ->{
            System.out.println(finalSum + e.length());
        });
        sum++;
    }

    public void Test01() {
        int b = 1 + a++;
        System.out.println("b:"+b);
        System.out.println("a:"+a);
        System.out.println("-----");
        int c = atomicInteger.getAndAdd(1);
        int i = atomicInteger.get();
        System.out.println("c:"+c);
        System.out.println("i:"+i);
        int i1 = atomicInteger02.addAndGet(1);
        int i2 = atomicInteger02.get();
        System.out.println("i1:" + i1);
        System.out.println("i2:" + i2);
    }
}
