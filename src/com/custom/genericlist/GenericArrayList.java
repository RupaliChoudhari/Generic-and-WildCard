package com.custom.genericlist ;

import java.util.Arrays;

//Using wild card here T can be a Number class or can be child class of Number
public class GenericArrayList<T> {
    private static int CUSTOM_SIZE = 5;
    Object [] generic_list;


    public  GenericArrayList(){
        generic_list= new Object[CUSTOM_SIZE];
    }
    int size = 0;
    public void add(T num){
        if (size==CUSTOM_SIZE){
            resizeMyArray();
        }
        generic_list[size++]=num;
    }

    public void resizeMyArray() {
        Object resizedList [] = new Object[generic_list.length*2];
        for (int i = 0; i<generic_list.length ; i++){
            resizedList[i] = generic_list[i];

        }
        generic_list = resizedList;
    }

    public boolean isFull(){

        return size == generic_list.length;
    }

    public T remove(){
        return  (T)generic_list[--size];

    }

    public T get(int index) {
            return (T)generic_list[index];
    }

    public int size() {
        return size;
    }
    @Override
    public String toString() {
        return "MyCustomArrayList{" +
                "list=" + Arrays.toString(generic_list) +
                ", size=" + size +
                '}';
    }

    public void set(int ind ,T value){
        generic_list[ind] =value;
    }
}
