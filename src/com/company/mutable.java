package com.company;

public class mutable {
    private int value;

    public mutable(int start){
        value = start;
    }
    public void IncrementValue(){
        value++;
    }
    public int getValue(){
        return value;
    }
}
