package com.it.demo07;

public class AA {
    static {
        AA11 = "AA11_s1";
        AA21 = "AA22_s1";

        System.out.println("s1:前父类静态块");
    }
    public static final String aaa;

    public static String AA11 = "AA11";
    public final static String AA12 = "AA12";

    public static String AA21 = "AA21";
    public final static String AA22 = "AA22";

    public static String AA31 = "AA31";
    public final static String AA32 = "AA32";

    public static String AA41 = "AA31";
    public final static String AA42 = "AA32";

    public String AA03;
    public String AA04;
    public String AA05;

    static {
        System.out.println("s2:后父类静态块前输出:AA11:" + AA11);
        System.out.println("s2:后父类静态块前输出:AA21:" + AA21);
        System.out.println("s2:后父类静态块前输出:AA31:" + AA31);
        AA21 = "AA21_s2";
        AA31 = "AA31_s2";
        aaa = "11";
        System.out.println("s2:后父类静态块后输出:AA21:" + AA21);
        System.out.println("s2:后父类静态块后输出:AA31:" + AA31);
    }

    {
        AA03 = "AA03_s3";
        AA04 = "AA04_s3";
        System.out.println("s3: AA03 :" + AA03 + ":前父类构造块");
        System.out.println("s3: AA04 :" + AA04 + ":前父类构造块");
    }

    public AA() {
    }

    public AA(String AA03, String AA04, String AA05) {
        this.AA03 = AA03;
        this.AA04 = AA04;
        this.AA05 = AA05;
    }

    public AA(String AA11 ,String AA03, String AA04, String AA05) {
        this.AA11 = AA11;
        this.AA03 = AA03;
        this.AA04 = AA04;
        this.AA05 = AA05;
    }

    {
        AA04 = "AA04_s4";
        AA05 = "AA05_s4";
        System.out.println("s4: AA04 :" + AA04 + ":后父类构造块");
        System.out.println("s4: AA05 :" + AA05 + ":后父类构造块");
    }
}
