package com.collectionstasks;
import java.util.*;

public class GetFirstLastTreeMapKey {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10,"A");
        map.put(20,"B");
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
