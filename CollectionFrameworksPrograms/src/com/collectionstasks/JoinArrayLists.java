package com.collectionstasks;
import java.util.*;

public class JoinArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        first.add(1);
        second.add(2);
        first.addAll(second);
        System.out.println(first);
    }
}
