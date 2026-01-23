package com.stream.tasks;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
    	//using list to stream
        List<Integer> ref = List.of(12,13,14,15,16,17,18,19);
        ref.stream().forEach(System.out::println);
        System.out.println("----");
        //using array to stream
        int[] a = {12,13,14,15,16,17,18};
        Arrays.stream(a).filter(/*lambda operator*/e->e>15).forEach(System.out::println);


        
    }
}
