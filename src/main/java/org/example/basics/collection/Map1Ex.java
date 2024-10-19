package org.example.basics.collection;

import java.util.*;

public class Map1Ex {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 4);
        map.put("Cherry", null);
        map.put("grapes", 2); // A null key

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

//        entryList.removeIf(entry->entry.getKey()==null);
//        // Sort by key with nulls placed at the end
//        entryList.sort(Comparator.nullsLast(Map.Entry.comparingByKey()));

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        // Print the sorted list of entries
        entryList.forEach(entry -> System.out.print(entry.getKey() + ": " + entry.getValue()));
        System.out.println();
        map.entrySet().forEach(entry -> System.out.print(entry.getKey() + ": " + entry.getValue()));
    }

}
