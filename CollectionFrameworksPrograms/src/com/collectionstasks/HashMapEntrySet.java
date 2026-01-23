package com.collectionstasks;
import java.util.*;

public class HashMapEntrySet {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        System.out.println(map.entrySet());
    }
}
