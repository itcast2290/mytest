package com.it.demo07;

public class AB extends AA{

    static {
        System.out.println("AB_s1:" + "子类静态块");
    }

    public String AB_01;
    public String AB_02 = "AB_02";
    public String AB_03;
    public String AB_04 = "AB_04";

    {
        System.out.println("s2_AB_01:" + AB_01 + ":前子类构造块前输出");
        System.out.println("s2_AB_02:" + AB_02 + ":前子类构造块前输出");
        AB_01 = "AB_01_s2";
        AB_02 = "AB_02_s2";
        System.out.println("AB_01_s2:" + AB_01 + "前子类构造块后输出");
        System.out.println("AB_02_s2:" + AB_02 + "前子类构造块后输出");
    }

    public AB(String AB_01, String AB_02, String AB_03, String AB_04) {
        this.AB_01 = AB_01;
        this.AB_02 = AB_02;
        this.AB_03 = AB_03;
        this.AB_04 = AB_04;
        System.out.println("AB_01_s3:" + AB_01 + "子类构造输出");
        System.out.println("AB_02_s3:" + AB_02 + "子类构造输出");
        System.out.println("AB_03_s3:" + AB_03 + "子类构造输出");
        System.out.println("AB_04_s3:" + AB_04 + "子类构造输出");
    }

    {
        AB_03 = "AB_03_s4";
        AB_04 = "AB_04_s4";
        System.out.println("AB_03_s4:" + AB_03 + ":后子类构造块输出");
        System.out.println("AB_04_s4:" + AB_04 + ":后子类构造块输出");
    }
}
