package com.collectionstasks;
import java.util.*;

public class TreeMapHigherKey {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"A");
        map.put(20,"B");
        System.out.println(map.higherKey(10));
    }
}
