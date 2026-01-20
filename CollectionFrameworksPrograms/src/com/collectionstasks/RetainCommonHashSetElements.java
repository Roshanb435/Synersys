package com.collectionstasks;
import java.util.*;

public class RetainCommonHashSetElements {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        a.add(1);
        a.add(2);
        b.add(2);
        a.retainAll(b);
        System.out.println(a);
    }
}
