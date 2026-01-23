package com.collectionstasks;
import java.util.*;

public class ConvertHashSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
