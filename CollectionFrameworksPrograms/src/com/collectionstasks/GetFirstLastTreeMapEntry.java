package com.collectionstasks;
import java.util.*;

public class GetFirstLastTreeMapEntry {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"One");
        map.put(3,"Three");
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
