package org.example.basics.streams;

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class GroupByExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 25),
                new Person("Eve", 35)
        );

        people.stream().collect(Collectors.toMap(Person::getAge, Person::getName,(k,v)->k+1))
                .entrySet().forEach(System.out::print);

        // Group people by age
        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        // Print the groups
        peopleByAge.forEach((age, group) ->
                System.out.println("Age " + age + ": " + group)
        );

        Map<Integer, Long> ageGroupCount = people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

        ageGroupCount.forEach((age, count) ->
                System.out.println("Age " + age + ": " + count + " people")
        );

        Map<Integer, List<String>> namesByAge = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(person -> person.name, Collectors.toList())
                ));

        namesByAge.forEach((age, names) ->
                System.out.println("Age " + age + ": " + names)
        );


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       // Custom Grouping Key Example
        Map<String, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));

        evenOddMap.forEach((key, group) ->
                System.out.println(key + ": " + group)
        );

// Grouping with Multiple Levels (Nested Grouping)
        Map<Integer, Map<Integer, List<Person>>> groupedByAgeAndNameLength = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.groupingBy(person -> person.name.length())
                ));

        groupedByAgeAndNameLength.forEach((age, nameLengthMap) -> {
            System.out.println("Age " + age + ":");
            nameLengthMap.forEach((nameLength, group) ->
                    System.out.println("  Name length " + nameLength + ": " + group)
            );
        });

        //Collectors.toMap() when key collison need to user merge function

        Stream<Integer> stream =Stream.of(1,2,3).peek(n->System.out.println("n: "+n));
        printItems(stream);
        Stream.of("am here stopped").forEach(System.out::println);
        /*
        * peek is an intermediate operation and also used understand flow of pipeline
         */
        Stream.of(1,2,3).filter(a->a>1)
                .peek(n->System.out.println("n: "+n))
                .forEach(System.out::println)
                ;

        Stream<String> a = Stream.of("a","b");
        Stream<String> b = Stream.of("c","c");
        Stream<String> result = Stream.of(a,b).flatMap(c->c);
        result.forEach(System.out::print);



        System.out.println();
        Optional<Integer> intss = Stream.of(12,34,26,80)
                .map(ss->ss+10)
                .reduce((op5,op6)->op5*op6);
        intss.ifPresent(System.out::println);
    }

    private static void printItems(Stream<Integer> stream) {
        stream.forEach(System.out::println);
    }
}
