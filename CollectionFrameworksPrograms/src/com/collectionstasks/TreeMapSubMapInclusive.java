package com.collectionstasks;
import java.util.*;

public class TreeMapSubMapInclusive {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"A");
        map.put(3,"C");
        map.put(5,"E");
        System.out.println(map.subMap(1,5));
    }
}
