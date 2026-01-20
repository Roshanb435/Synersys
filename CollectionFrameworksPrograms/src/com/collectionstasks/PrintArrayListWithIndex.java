package com.collectionstasks;
import java.util.*;

public class PrintArrayListWithIndex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        for(int i=0;i<list.size();i++)
            System.out.println(i+" "+list.get(i));
    }
}
