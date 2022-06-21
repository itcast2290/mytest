package com.it.demo03;

import com.it.D;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class Test05 {
    public static void main(String[] args) throws NoSuchMethodException {
        Document[] values = Document.values();
        for (Document value : values) {
            System.out.println(value.getDocumentId() +  ":" + value.getContent());
        }
        Class<D> dClass = D.class;

        Class<?>[] interfaces = dClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {

            String name = anInterface.getName();
            System.out.println("name"+ ":" + name);
        }
        Type[] genericInterfaces = dClass.getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            String typeName = genericInterface.getTypeName();
            System.out.println("typeName"+ ":" + typeName);
        }
        List<int[]> ints = Arrays.asList(new int[]{1, 2, 3});
        for (int[] anInt : ints) {
            System.out.println("anInt"+":"+ anInt);
        }
        List<D> ds = Arrays.asList(new D[]{new D("content1"), new D("content2")});
        for (D d : ds) {
            System.out.println("d"+":"+ d);
        }
    }
}
