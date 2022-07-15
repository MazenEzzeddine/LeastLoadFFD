package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> items = List.of(10, 20, 30);
        Bin b = new Bin(30);
        FirstFitDecreasing ffd = new FirstFitDecreasing(items, b);
        ffd.fit();
        ffd.getBins();


        // write your code here
    }
}
