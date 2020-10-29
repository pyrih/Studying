package org.pyrih.math;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = console.nextInt();

        if (number % 2 == 0) {   // even
            System.out.println("Your number is even");
        } else {   // odd
            System.out.println("Your number is odd");
        }
    }
}
