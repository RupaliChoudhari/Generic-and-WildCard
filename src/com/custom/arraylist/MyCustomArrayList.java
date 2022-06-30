package com.custom.arraylist ;

import java.util.Arrays;

public class MyCustomArrayList {
    private static int CUSTOM_SIZE = 5;
    int [] list;

    public  MyCustomArrayList(){
        list= new int[CUSTOM_SIZE];
    }
    int size = 0;
    public void add(int num){
       if (size==CUSTOM_SIZE){
           resizeMyArray();
       }
       list[size++]=num;
    }

    public void resizeMyArray() {
        int resizedList [] = new int[list.length*2];
        for (int i = 0; i<list.length ; i++){
            resizedList[i] = list[i];

        }
        list = resizedList;
    }

    public boolean isFull(){

       return size == list.length;
    }

    public int remove(){
        return  list[--size];

    }

    public int get(int index) {
        if (index < size)
            return list[index];
        else
            return -1;
    }

    public int size() {
        return size;
    }
    @Override
    public String toString() {
        return "MyCustomArrayList{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }

    public void set(int ind ,int value){
        list[ind] =value;
    }
}


