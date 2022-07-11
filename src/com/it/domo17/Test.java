package com.it.domo17;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String b = "aacccddgrifd";
        String f = "afafcdcd";
        String c = "/^(aa)\1{1,}$/";
        String d = "(aa){1,}";
        String g = "(af)\\1{1,}(cd)\\2{1,}";
        String h = "(af)\\1+(cd)\\2+";
        System.out.println(Pattern.matches(c , b));
        // System.out.println(b.replaceAll(d, "jj"));
        String k = f.replace("a", "k");
        String l = f.replace(h, "l");
        //System.out.println(f);
        System.out.println(k);
       /// System.out.println(l);
        //System.out.println(f.matches(g));
        //System.out.println(f.matches(h));
       // System.out.println(f.replaceAll(h, "l"));
    }
}
