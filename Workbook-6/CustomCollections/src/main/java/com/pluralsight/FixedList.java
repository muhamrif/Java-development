package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    private List<T> items=new ArrayList<>();
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<T> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }


    public void add(T item){

        if(items.size()<this.maxSize){
            this.items.add(item);
        }else{
            System.out.println("Max limit reached");
        }

    }


}
