package com.collectionstasks;
import java.util.*;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        HashSet<Integer> clone = (HashSet<Integer>) set.clone();
        System.out.println(clone);
    }
}
