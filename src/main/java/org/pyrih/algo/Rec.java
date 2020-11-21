package org.pyrih.algo;

public class Rec {
    public static void main(String[] args) {
//        countdown(10);

        int factorial = factorial(5);
        System.out.println("Factorial = " + factorial);
        System.out.println();

        int gcd1 = gcd(1680, 640);
        int gcd2 = gcd(640, 1680);
        System.out.println("GCD 1 = " + gcd1);
        System.out.println("GCD 2 = " + gcd2);
        System.out.println();

        int sumOfNumbers = sumOfNumbers(new int[]{5, 10, 20});
        System.out.println(sumOfNumbers);
        System.out.println();

        int sumOfNumbersRecursive = sumOfNumbersRec(10);
        System.out.println(sumOfNumbersRecursive);
        System.out.println();
    }

    public static void countdown(int i) {
        System.out.println("i = " + i);
        if (i > 0) {
            countdown(i - 1);
        }
    }

    public static int factorial(int i) { // 5! = 5 * 4 * 3 * 2 * 1
        if (i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException();

        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int sumOfNumbers(int[] x) {
        int total = 0;

        for (int i : x) {
            total += i;
        }
        return total;
    }

    public static int sumOfNumbersRec(int x) {
        if (x < 10)
            return x;
        return (x % 10) + sumOfNumbersRec(x / 10);
    }

    public static int[] quicksort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            int pivot = arr[0];


        }

return arr; // todo
    }

}
