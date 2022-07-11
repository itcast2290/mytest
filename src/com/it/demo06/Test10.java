package com.it.demo06;

public class Test10 {

    private class Test11{
        public void test11() {
            System.out.println("test11");
        }
    }

    public static void main(String[] args) {

    }

    public void test12() {
        Test11 test11 = new Test11();
        test11.test11();
    }

    public void test13() {
        Test10 test10 = new Test10();
        test10.test12();
    }

    public void Test14() {
        Test10.Test11 test11 = new Test10().new Test11();
        test11.test11();
    }

    public void test10() {
        System.out.println("test10");
    }
}
