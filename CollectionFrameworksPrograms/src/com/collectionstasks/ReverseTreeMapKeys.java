package com.collectionstasks;
import java.util.*;

public class ReverseTreeMapKeys {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"A");
        map.put(2,"B");
        System.out.println(map.descendingKeySet());
    }
}
