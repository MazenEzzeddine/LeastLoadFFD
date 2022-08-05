package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeastLoadFFD {

    private List<Integer> items;
    private Bin bin;
    private ArrayList<Bin> bins;



    public LeastLoadFFD(List<Integer> items, Bin bin) {
        this.items = items;
        this.bin = bin;
        this.bins = new ArrayList<>();
    }

    public void fit() {
        Bin b = new Bin(bin.getBinCapacity());
        bins.add(b);


        items.sort(Collections.reverseOrder());

        //Collections.sort(items, Collections.reverseOrder());
        while (true) {
            //reset consumers
            for (Bin  bb :bins){
                bb.reset();
            }
            int i;
            for ( i = 0; i < items.size(); i++) {
                int j;
               Collections.sort(bins);
                for (j = 0; j < bins.size(); j++) {
                    if (items.get(i) <= bins.get(j).getCurrentCapacity()) {
                        bins.get(j).assign(items.get(i));
                        break;
                    }
                }
                if (j == bins.size()) {
                    b = new Bin(bin.getBinCapacity());
                    bins.add(b);
                    break;
                }
            }

            if (i==  items.size()) {
                break;
            }
        }
    }

    public ArrayList<Bin> getBins() {
        return bins;
    }


    @Override
    public String toString() {
        return "FirstFitDecreasing{" +
                "bins=\n" + bins +
                "}\n";
    }




}
