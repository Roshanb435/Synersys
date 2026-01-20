package com.collectionstasks;
import java.util.*;

public class HashMapContainsValue {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        System.out.println(map.containsValue("A"));
    }
}
