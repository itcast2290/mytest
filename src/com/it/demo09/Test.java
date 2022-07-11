package com.it.demo09;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {

    public static void main(String[] args) {
        BigDecimal divide = new BigDecimal("12333.3448843").divide(new BigDecimal(2.111111111111111), 3 ,RoundingMode.HALF_UP);
        System.out.println(divide);


    }

}
