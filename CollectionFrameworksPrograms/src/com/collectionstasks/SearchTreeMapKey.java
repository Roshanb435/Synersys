package com.collectionstasks;
import java.util.*;

public class SearchTreeMapKey {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"A");
        System.out.println(map.containsKey(1));
    }
}
