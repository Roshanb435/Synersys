package com.collectionstasks;
import java.util.*;

public class IncreaseArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(30);
        list.add(10);
        System.out.println(list);
    }
}
