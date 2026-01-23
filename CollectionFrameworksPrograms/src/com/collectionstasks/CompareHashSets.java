package com.collectionstasks;
import java.util.*;

public class CompareHashSets {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        a.add(1);
        b.add(1);
        System.out.println(a.equals(b));
    }
}
