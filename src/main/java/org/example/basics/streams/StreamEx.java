package org.example.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx {
    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(System.out::print);
        IntStream.rangeClosed(1,5).forEach(System.out::print);
        System.out.println();
        //staircase problem
        int n =5;
        IntStream.rangeClosed(1, n).forEach(i -> {
            String spaces = " ".repeat(n - i);  // Create spaces
            String hashes = "#".repeat(i);      // Create hashes
            System.out.println(spaces + hashes);  // Print the combined line
        });

        List<String> lists = Arrays.asList("ganesh", null, "tam");
       lists.stream().filter(Objects::nonNull).toList().forEach(System.out::println);


        //newList.forEach(System.out::print);
    }
}
