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

    public int get(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return elementData[index];
    }

    public void add(int index, int value){
        if(size==elementData.length){
            elementData = Arrays.copyOf(elementData,elementData.length+elementData.length/2);
        }
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index] = value;
        size++;
    }


    public void add(int value) {
        modCount++;
        add(size,value);
    }

}
