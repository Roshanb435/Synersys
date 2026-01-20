package com.collectionstasks;
import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        Collections.reverse(list);
        System.out.println(list);
    }
}
