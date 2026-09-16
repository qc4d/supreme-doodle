package com.Collection;

import java.util.Arrays;

public class MyArrayList {
    int[] elementData;
    int size;
    int modCount;
    public MyArrayList() {
        elementData = new int[10];
        size = 0;
    }

    public MyArrayList(int capacity) {
        elementData = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        if(size == elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length + elementData.length / 2);
        }
        elementData[size++] = value;
    }


}
