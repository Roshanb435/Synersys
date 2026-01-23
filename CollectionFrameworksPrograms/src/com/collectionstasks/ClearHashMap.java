package com.collectionstasks;
import java.util.*;

public class ClearHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.clear();
        System.out.println(map);
    }
}
