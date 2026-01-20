package com.collectionstasks;
import java.util.*;

public class TreeMapTailMapInclusive {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"A");
        map.put(3,"C");
        System.out.println(map.tailMap(3,true));
    }
}
