package com.collectionstasks;
import java.util.*;

public class RemoveTreeSetElement {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.remove(5);
        System.out.println(set);
    }
}
