package com.collectionstasks;
import java.util.*;

public class GetHashMapKeys {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        System.out.println(map.keySet());
    }
}
