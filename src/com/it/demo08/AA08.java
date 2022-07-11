package com.it.demo08;

public class AA08 {

    static {
        System.out.println("外部类静态块前");
    }

    {
        System.out.println("外部类构造块");
    }
    public AA08() {
        System.out.println("外部类构造方法");
    }

    public static String aa08s01 = "111";

    public String aa08c01 = "aa08c01";

    // public static String aa08s02 = AC.ac_s;

    public String aa08c02 = AC.ac_s;

    {
        System.out.println("外部类构造块中");
    }
    public static class AC {
        static {
            System.out.println("内部类静态块前");
        }
        public static String ac_s = "ac_s";

        public String ac_c;
        static {
            System.out.println("内部类静态块后");
        }

        {
            System.out.println("内部类构造块后");
        }
        public AC(String ac_c) {
            this.ac_c = ac_c;
            System.out.println("内部类构造器");
        }

    }

    public class AB08 {
        {
            System.out.println("内部类构造块AB08");
        }

        private String ab08a;

        public AB08(String ab08a) {
            System.out.println("内部类qian构造:" + this.ab08a);
            this.ab08a = ab08a;
            System.out.println("内部类hou构造:" + this.ab08a);
        }

    }

    static {
        System.out.println("外部类静态块后");
    }
}
