package com.it.demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) {
        try {
            Constructor<H> constructor = H.class.getConstructor(String.class);
            constructor.setAccessible(true);
            H h = constructor.newInstance("555");
            System.out.println(
                    h
            );
            System.out.println("h" + ":" + h.toString());
            System.out.println(h.hashCode());
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
        String f = null;
        System.out.println("11" + f);
    }
}
