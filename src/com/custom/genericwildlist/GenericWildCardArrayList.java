package com.custom.genericwildlist;

import java.util.Arrays;

public class GenericWildCardArrayList<T extends Number> {


    //Using wild card here T can be a Number class or can be child class of Number
        private static int CUSTOM_SIZE = 5;
        Object [] generic_wildcard_list;


        public  GenericWildCardArrayList(){
            generic_wildcard_list = new Object[CUSTOM_SIZE];
        }
        int size = 0;
        public void add(T num){
            if (size==CUSTOM_SIZE){
                resizeMyArray();
            }
            generic_wildcard_list[size++]=num;
        }

        public void resizeMyArray() {
            Object resizedList [] = new Object[generic_wildcard_list.length*2];
            for (int i = 0; i< generic_wildcard_list.length ; i++){
                resizedList[i] = generic_wildcard_list[i];

            }
            generic_wildcard_list = resizedList;
        }

        public boolean isFull(){

            return size == generic_wildcard_list.length;
        }

        public T remove(){
            return  (T) generic_wildcard_list[--size];

        }

        public T get(int index) {
            return (T) generic_wildcard_list[index];
        }

        public int size() {
            return size;
        }
        @Override
        public String toString() {
            return "MyCustomArrayList{" +
                    "list=" + Arrays.toString(generic_wildcard_list) +
                    ", size=" + size +
                    '}';
        }

        public void set(int ind ,T value){
            generic_wildcard_list[ind] =value;
        }


}

