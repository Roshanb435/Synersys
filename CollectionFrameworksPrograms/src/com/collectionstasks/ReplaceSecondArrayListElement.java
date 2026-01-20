package com.collectionstasks;
import java.util.*;

public class ReplaceSecondArrayListElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.set(1,"C++");
        System.out.println(list);
    }
}
