package com.collectionstasks;
import java.util.*;

public class SwapArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
