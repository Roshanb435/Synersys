package com.collectionstasks;
import java.util.*;

public class TreeSetHigherElement {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        System.out.println(set.higher(5));
    }
}
