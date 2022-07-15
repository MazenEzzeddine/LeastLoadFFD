package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstFitDecreasing {
    private List<Integer> items;
    private Bin bin;
    private ArrayList<Bin> bins;

    @Override
    public String toString() {
        return "FirstFitDecreasing{" +
                "bins=\n" + bins +
                "}\n";
    }

    public FirstFitDecreasing(List<Integer> items, Bin bin) {
        this.items = items;
        this.bin = bin;
        this.bins = new ArrayList<>();
    }



    public void fit(){
        Bin b = new Bin(bin.getBinCapacity());
        bins.add(b);



        List<Integer> mitems = new ArrayList<Integer>(items);
        Collections.sort(mitems, Collections.reverseOrder());
        for(int i = 0; i< mitems.size(); i++){
            int j;
            for( j=0; j<bins.size();j++){
                if(mitems.get(i)<= bins.get(j).getCurrentCapacity()) {
                    bins.get(j).assign(mitems.get(i));
                    break;
                }
            }
           if(j==bins.size()) {
               b= new  Bin(bin.getBinCapacity());
               b.assign(mitems.get(i));
               bins.add(b);
           }
        }
    }

    public ArrayList<Bin> getBins() {
        return bins;
    }




}
