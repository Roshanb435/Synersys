package com.collectionstasks;
import java.util.*;

public class ConvertHashSetToArrayList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
