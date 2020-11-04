package org.pyrih.cs.datastructures.codewithm;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] items;
    private int rear;
    private int front;
    private int size;

    public ArrayQueueImpl(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if(size == items.length)
            throw new IllegalStateException();

        items[rear++] = item;
        size++;
    }

    public int dequeue() {
        int item = items[front];
        items[front++] = 0;
        size--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}