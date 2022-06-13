package com.it;

public interface A {
    default void hello() {
        System.out.println("a");
    }
}
