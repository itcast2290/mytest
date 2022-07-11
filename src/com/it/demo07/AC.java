package com.it.demo07;

public class AC {

    public String ac01;

    public String ac02 = "aaa";

    {
        System.out.println("前前置构造块:ac01:" + ac01);
        System.out.println("前前置构造块:ac02:" + ac02);
        ac01 = "前置构造ac01";
        ac02 = "前置构造ac02";
        System.out.println("前后置构造块:ac01:" + ac01);
        System.out.println("前后置构造块:ac02:" + ac02);
    }

    public AC(String ac01, String ac02) {
        System.out.println("前构造器:ac01:" + this.ac01);
        System.out.println("前构造器:ac02:" + this.ac02);
        this.ac01 = ac01;
        this.ac02 = ac02;
        System.out.println("后构造器:ac01:" + this.ac01);
        System.out.println("后构造器:ac02:" + this.ac02);
    }
    public AC() {
    }
    {
        System.out.println("后前置构造块:ac01:" + ac01);
        System.out.println("后前置构造块:ac02:" + ac02);
        ac01 = "后置构造ac01";
        ac02 = "后置构造ac02";
        System.out.println("后后置构造块:ac01:" + ac01);
        System.out.println("后后置构造块:ac02:" + ac02);
    }

    @Override
    public String toString() {
        return "AC{" +
                "ac01='" + ac01 + '\'' +
                ", ac02='" + ac02 + '\'' +
                '}';
    }
}
