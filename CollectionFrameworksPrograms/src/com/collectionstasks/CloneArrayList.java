package com.collectionstasks;
import java.util.*;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        ArrayList<Integer> clone = (ArrayList<Integer>) list.clone();
        System.out.println(clone);
    }
}
