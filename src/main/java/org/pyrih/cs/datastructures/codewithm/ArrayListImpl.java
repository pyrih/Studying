package org.pyrih.cs.datastructures.codewithm;

public class ArrayListImpl {
    private int[] items;
    private int size;

    public ArrayListImpl(int length) {
        items = new int[length];
        this.size = 0;
    }

    public void insert(int item) {
        if (items.length == size) {
            int[] array = new int[(int) (size * 1.5)];

            for (int i = 0; i < size; i++)
                array[i] = items[i];

            items = array;
        }
        items[size++] = item; // or items[size] = item; size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();

        for (int i = index; i < size; i++)
            items[i] = items[i + 1];

        size--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++)
            if (item == items[i])
                return i;

        return -1;
    }

    public int max() {
        int max = items[0];
        for (int i = 0; i < size; i++)
            if (max < items[i + 1])
                max = items[i + 1];
        return max;
    }

    public ArrayListImpl intersect(int[] other) {
        ArrayListImpl intersection = new ArrayListImpl(10);

        for (int i = 0; i < size; i++)
            for (int j = 0; j < other.length; j++)
                if (items[i] == other[j])
                    intersection.insert(items[i]);

        return intersection;
    }

    public void reverse() {
        int half = size / 2;
        int last = size - 1;
        for (int i = 0; i < half; i++) {
            int temp = items[i];
            items[i] = items[last - i];
            items[last - i] = temp;
        }
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();
        // resize if needed
        if (items.length == size) {
            int[] array = new int[(int) (size * 1.5)];
            for (int i = 0; i < size; i++)
                array[i] = items[i];
            items = array;
        }
        // do rearrange
        for (int i = size - 1; i >= index; i --) {
            items[i + 1] = items[i];
        }
        // do insertion
        items[index] = item;
        size++;

    }

    public void replaceAt(int item, int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();

        items[index] = item;
    }


    public void print() {
        for (int i = 0; i < size; i++)
            System.out.println(items[i]);
    }

}
