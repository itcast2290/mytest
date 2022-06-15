/**
 *
 */
package com.it.demo02;

import java.util.stream.Stream;

/**
 * The demo main
 *
 * time
 * another
 */
public class Main {
    public static void main(String[] args) {
        Person zs = new Person("zhangsan", 4);
        Person ww = new Person("wangwu", 5);
        Person ls = new Person("lisi", 6);
        Person xm = new Person("xiaoming", 3);
        Person zs2 = new Person("zhangsan2", 4);
        Stream.of(
                zs
                , ww
                , ls
                , xm
                ,zs2
        ).distinct()
                .forEach(System.out::println);
        System.out.println("---------------------------------");
        Stream.of(
                zs
                , ww
                , ls
                , xm
                ,zs2
        ).sorted().forEach(System.out::println);
        System.out.println("---------------------------------");
        Stream.of(
                zs
                , ww
                , ls
                , xm
                ,zs2
        ).sorted((o1, o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);
        System.out.println("---------------------------------------");
        Stream.of("1","2","9","4","5","3")
                .map(Integer::parseInt)
                .sorted((o1, o2)-> o2 - o1).forEach(System.out::println);
    }
}
