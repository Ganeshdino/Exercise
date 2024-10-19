package org.example.basics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * modification is possible by both foreach and iterator loop by index
 * adding and removing directly is not possible by both throw concurrentModificationException with failfast
 * but Iterator, we can do same removal by Iterator.remove() method
 */
public class ListWithIteration {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("ganesh");
        names.add("raja");
        names.add("dls");
        int j =0;
       /* System.out.println("iterating through for each");
        for(String name : names) {

            if(name.equalsIgnoreCase("ganesh")) {
                names.set(i,"mahadev");
                //names.remove(name);
                //names.add("kimm");
            }
            System.out.println(name);
            i++;
        }*/
        System.out.println("---------------");
        System.out.println("iterating through iterator");
        Iterator<String> itrstr = names.iterator();
        while(itrstr.hasNext()) {
            String found = itrstr.next();
            if(found.equalsIgnoreCase("ganesh")) {
                names.set(j,"mahadev");
               // names.add("kim");
                //names.remove(found);
                itrstr.remove();
            }
            System.out.println(found);
            j++;
        }
        System.out.println("forEach loop with lambda");
        names.forEach(System.out::println);

        System.out.println("--Safe Removal of item by Iterator.remove() method------");

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Create an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate through the list and remove even numbers
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();  // Safe removal of the current element
            }
        }

        // Print the modified list
        System.out.println("List after removing even numbers: " + numbers);
    }

}
