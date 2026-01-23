package com.collectionstasks;
import java.util.*;

public class TrimArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(1);
        list.trimToSize();
        System.out.println(list);
    }
}
