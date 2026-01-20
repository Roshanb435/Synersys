package com.collectionstasks;
import java.util.*;

public class GetFirstLastTreeSetElements {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        System.out.println(set.first()+" "+set.last());
    }
}
