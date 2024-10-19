package org.example.basics.collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class TreeSetEx {

    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();

        t.add(3);
        t.add(5);
        t.add(6);

        System.out.println(t);

        String s1 = "ganesh";
        System.out.println(s1.compareTo("dfe"));

        Set<Integer> sets = Set.of(3, 2, 6, 1, 9);
        //Collections.sort(sets);  -- not possible
        Set<Integer> setsStr = sets.stream()
                .sorted()
                .collect(Collectors.toSet());

        setsStr.forEach(System.out::print);
        System.out.println();
        Set<Integer> orderedSet = sets.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        orderedSet.forEach(System.out::print);

        System.out.println();
        Set<Integer> sortedSet = sets.stream()
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));
        orderedSet.forEach(System.out::print);

    }
}
