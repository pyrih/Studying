package org.pyrih.cs.datastructures.codewithm;

import java.util.Arrays;

public class StackImpl {
    private int[] items = new int[5];
    private int size;

    public void push(int item) {
        if (size == items.length)
            throw new StackOverflowError();

        items[size++] = item;
    }

    public int pop() {
        return items[--size];
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return items[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        int[] ints = Arrays.copyOfRange(items, 0, size);
        return Arrays.toString(ints);
    }
}
