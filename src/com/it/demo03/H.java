package com.it.demo03;

import java.util.HashMap;

public class H {
    private String d;

    private int c;
    public H(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "H{" +
                "d='" + d + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return 30 + (d != null ? d.hashCode() : 0 ) + c * 31;
       // return super.hashCode(this.d);
    }
}
