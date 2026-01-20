package com.collectionstasks;
import java.util.*;

public class TreeSetLessThanSeven {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(7);
        set.add(10);
        System.out.println(set.headSet(7));
    }
}
