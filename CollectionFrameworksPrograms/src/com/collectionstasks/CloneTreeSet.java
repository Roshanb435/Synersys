package com.collectionstasks;
import java.util.*;

public class CloneTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(7);
        TreeSet<Integer> clone = (TreeSet<Integer>) set.clone();
        System.out.println(clone);
    }
}
