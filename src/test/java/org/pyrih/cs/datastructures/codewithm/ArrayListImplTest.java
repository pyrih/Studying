package org.pyrih.cs.datastructures.codewithm;

import org.junit.Before;
import org.junit.Test;

public class ArrayListImplTest {

    private ArrayListImpl array;

    @Before
    public void createArray() {
        array = new ArrayListImpl(3);
    }

    @Test
    public void test() {
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);
        array.insert(7);
        array.insert(8);
        array.insert(9);
        array.insertAt(0, 0);
        array.print();
    }

}