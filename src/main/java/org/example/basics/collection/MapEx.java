package org.example.basics.collection;

import java.util.*;
import java.util.stream.Collectors;


public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<String,Integer>();
        maps.put("Maths", 90);
        maps.putIfAbsent("FB", 20);
        maps.putIfAbsent("Ea", 30);
        maps.getOrDefault("Ea", 34);
        Integer good = maps.computeIfAbsent("good", a -> Integer.valueOf(maps.getOrDefault(a,2)+"1"));
        System.out.println(good);
        System.out.println(maps);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 1);
        hashMap.put("Apple", 3);
        hashMap.put("Orange", 2);
        hashMap.put("grapes", null);
        //  hashMap.put(null,7);
//        hashMap.put(null,9);
      //  hashMap.put("Banana", 5);
        hashMap.put("FB",89);
        hashMap.put("Ea",45);
        System.out.println(hashMap);

        SortedMap<String, Integer> sortedHashMap = new TreeMap<>(hashMap);
        System.out.println("sortedHashMapbytkeys: " + sortedHashMap);


        Map<String,Integer> mapsByKey = hashMap.entrySet().stream()
              //  .sorted((entry1,entry2)->entry1.getKey().compareTo(entry2.getKey()))
//                .sorted(Comparator.nullsLast(Map.Entry.comparingByKey()))
                .filter(entry->Objects.nonNull(entry.getKey()))
                .filter(entry->Objects.nonNull(entry.getValue()))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldvalue, newvalue)->oldvalue,
                        LinkedHashMap::new
                ));
        mapsByKey.forEach((key,value)->System.out.println("key :"+key + "  value: "+ value));
        System.out.println();

        Map<String,Integer> mapsByValue = hashMap.entrySet().stream()
               // .filter(entry->Objects.nonNull(entry.getValue()))
                .filter(entry->entry.getValue()!=null)
                //.peek(System.out::println)
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldvalue, newvalue)->oldvalue,
                        LinkedHashMap::new
                ));

        mapsByValue.forEach((key,value)->System.out.println("key :"+key + "  value: "+ value));

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

        // Sort the list by value
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        // Create a new LinkedHashMap to maintain insertion order of sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted by values: " + sortedMap);
    }
}
