package org.example.basics.collection;

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("ganesh");
        names.add("raja");
        names.add("dls");

        System.out.println("traversing by forEach loop");

        for(String name : names) {
            System.out.println(name);
            if(name.equalsIgnoreCase("raja")) {
                names.remove(name);
                //names.add("mahadev");
            }
        }
        System.out.println("---------------");

        names.add("raja");
        System.out.println("traversing through iterator");

        Iterator<String> itrstr = names.iterator();
        while(itrstr.hasNext()) {
            String found = itrstr.next();
            if(found.equalsIgnoreCase("ganesh")){
                names.remove(found);
            }
        }

        List<String> namesLinked = new LinkedList<>();
        namesLinked.add("ganesh");
        namesLinked.add("raju");
      // namesLinked.add(null);
       namesLinked.stream().filter(Objects::nonNull).forEach(System.out::println);
        namesLinked.stream().filter(Objects::nonNull).forEach(System.out::println);

       namesLinked.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
       //namesLinked.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
        //  System.out.println(namesLinked);
      //  namesLinked.sort(null);
        namesLinked.forEach(System.out::println);
       // Collections.sort(namesLinked);
        Deque<String> dsq = new LinkedList<>(namesLinked);
        System.out.println(dsq);

        Optional<String> ssop= Optional.empty();


        PriorityQueue<String> pdsq = new PriorityQueue<>();

    }


}
