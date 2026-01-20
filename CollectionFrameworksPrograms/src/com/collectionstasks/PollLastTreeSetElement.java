package com.collectionstasks;
import java.util.*;

public class PollLastTreeSetElement {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set.pollLast());
        System.out.println(set);
    }
}
