package com.collectionstasks;
import java.util.*;

public class GetTreeMapKeys {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(2,"B");
        map.put(1,"A");
        System.out.println(map.keySet());
    }
}
