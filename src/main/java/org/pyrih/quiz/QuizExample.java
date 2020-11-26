package org.pyrih.quiz;

import java.math.BigDecimal;

public class QuizExample {
    public static void main(String[] args) {
        System.out.println(0 & 1);
        System.out.println(1 & 1);
        System.out.println(2 & 1);
        System.out.println(3 & 1);
        System.out.println(4 & 1);
        System.out.println(5 & 1);

        System.out.println("-----------------");

        System.out.println(0 | 1);
        System.out.println(1 | 1);
        System.out.println(2 | 1);
        System.out.println(3 | 1);
        System.out.println(4 | 1);

        System.out.println("-----------------");

        System.out.println(-3 % 2);
        System.out.println(-10 % 4);

        System.out.println("-----------------");

        double d = 0.97;
        System.out.println(new BigDecimal(d));
    }
}
