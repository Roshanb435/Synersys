package com.collectionstasks;
import java.util.*;

public class ReverseTreeSetOrder {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.descendingSet());
    }
}
