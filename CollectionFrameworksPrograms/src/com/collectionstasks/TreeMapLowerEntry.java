package com.collectionstasks;
import java.util.*;

public class TreeMapLowerEntry {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"A");
        map.put(20,"B");
        System.out.println(map.lowerEntry(20));
    }
}
