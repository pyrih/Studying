package org.pyrih.cs.datastructures.codewithm;

import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> one = new Stack<>();
    private Stack<Integer> two = new Stack<>();

    public void enqueue(int item) {
        one.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        moveOneToTwo();
        return two.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        moveOneToTwo();
        return two.peek();
    }

    public boolean isEmpty() {
        return one.isEmpty() && two.isEmpty();
    }

    private void moveOneToTwo() {
        if (two.isEmpty()) {
            while (!one.isEmpty()) {
                two.push(one.pop());
            }
        }
    }


}
