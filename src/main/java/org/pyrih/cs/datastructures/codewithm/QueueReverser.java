package org.pyrih.cs.datastructures.codewithm;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {

    public static Queue<Integer> reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }
}
