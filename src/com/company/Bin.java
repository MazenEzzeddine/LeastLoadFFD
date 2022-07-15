package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Bin {
    private Integer binCapacity;

    private Integer currentCapacity;
    private ArrayList<Integer> assignedItems;


    public Integer getBinCapacity() {
        return binCapacity;
    }






    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }



    public Bin(Integer binCapacity) {
        this.binCapacity = binCapacity;
        currentCapacity = binCapacity;
        assignedItems = new ArrayList<>();
    }



    public void assign(Integer item) {
        assignedItems.add(item);
        currentCapacity -= item;
    }





    @Override
    public int hashCode() {
        return binCapacity != null ? binCapacity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Bin{" +
                "binCapacity=" + binCapacity +
                '}';
    }
}
