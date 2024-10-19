package org.example.basics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add(null);
        list.add("Apple");
        list.add("Cherry");
        list.add(null);

        // Sort list, placing null values at the beginning
        Collections.sort(list, Comparator.nullsFirst(Comparator.naturalOrder()));

        System.out.println(list); // Output: [null, null, Apple, Banana, Cherry]

        list.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println(list);


    }
}
