package com.collectionstasks;
import java.util.*;

public class GetHashMapValues {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"X");
        map.put(2,"Y");
        System.out.println(map.values());
    }
}
