package com.it.demo14;

public class Test {

    public static void main(String[] args) {
        ProxyTest proxyTest = new ProxyTest();
        B b = new B();
        A proxyInstance = (A)proxyTest.getProxyInstance(b);
        proxyInstance.testA();
    }
}
