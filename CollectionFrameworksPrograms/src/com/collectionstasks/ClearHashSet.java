package com.collectionstasks;
import java.util.*;

public class ClearHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.clear();
        System.out.println(set);
    }
}
