package com.collectionstasks;
import java.util.*;

public class CloneHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"X");
        HashMap<Integer,String> clone = (HashMap<Integer,String>) map.clone();
        System.out.println(clone);
    }
}
