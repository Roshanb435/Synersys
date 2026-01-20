package com.collectionstasks;
import java.util.*;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<>();
        source.add(10);
        source.add(20);
        ArrayList<Integer> target = new ArrayList<>(source);
        System.out.println(target);
    }
}
