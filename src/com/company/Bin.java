package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Bin implements Comparable<Bin> {
    private Integer binCapacity;

    private Integer currentCapacity;
    private ArrayList<Integer> assignedItems;

    @Override
    public String toString() {
        return "Bin{" +
                "binCapacity=" + binCapacity +
                ", currentCapacity=" + currentCapacity +
                ", assignedItems=" + assignedItems +
                "}\n";
    }

    public Integer getBinCapacity() {
        return binCapacity;
    }


    public void reset(){
        assignedItems.clear();
        currentCapacity = binCapacity;
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
    public int compareTo(Bin o) {
        //return currentCapacity.compareTo(o.currentCapacity);

        return o.currentCapacity.compareTo(currentCapacity);
    }
}
