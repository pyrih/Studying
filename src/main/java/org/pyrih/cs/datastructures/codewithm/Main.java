package org.pyrih.cs.datastructures.codewithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String... args) {
        // REVERSER
        String s = "oracle";
        StringReverser reverser = new StringReverser();
        String reverse = reverser.reverse(s);
        System.out.println(reverse);

        //BALANCED STRING
        String balanced = "(1 + 2)";
        String balanced1 = "(([1] + <2>)) [a]";
        String unbalanced1 = "(1 + 2>";
        String unbalanced2 = ")1 + 2(";

        Expression expression = new Expression();

        System.out.println(expression.isBalanced(balanced));
        System.out.println(expression.isBalanced(balanced1));
        System.out.println(expression.isBalanced(unbalanced1));
        System.out.println(expression.isBalanced(unbalanced2));

        System.out.println("----------------------------");

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue.toString());

        Queue<Integer> reverseQueue = QueueReverser.reverse(queue);
        System.out.println(reverseQueue);



    }
}
