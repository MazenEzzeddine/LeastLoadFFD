package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //List<Integer> items = List.of(10, 25, 30);
        //List<Integer> items = List.of(10, 10, 15,5);

        List<Integer> items =  new ArrayList<>();
        items.add(10);
        items.add(10);
        items.add(15);
        items.add(5);



        Bin b = new Bin(30);
        FirstFitDecreasing ffd = new FirstFitDecreasing(items, b);
        ffd.fit();


        System.out.println(ffd.toString());


        LeastLoadFFD llffd= new LeastLoadFFD(items,b);
        llffd.fit();

        System.out.println(llffd.toString());







        // write your code here
    }
}
