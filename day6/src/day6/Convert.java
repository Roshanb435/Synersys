package day6;
import java.util.*;

public class Convert {
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 5};
        List<Integer> l = new ArrayList<>();

        for (int x : arr) {
            l.add(x);   // auto-boxing int → Integer
        }

        System.out.println(l);
    }
}
