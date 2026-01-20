package com.collectionstasks;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
