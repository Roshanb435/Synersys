package com.collectionstasks;
import java.util.*;

public class CompareTreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        a.add(5);
        b.add(5);
        System.out.println(a.equals(b));
    }
}
