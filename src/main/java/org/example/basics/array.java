package org.example.basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class array {
    public static void main(String[] args) {
        int a[];
        int x[] = new int[15];
        System.out.println(x[0]);
        x[1] = 2;
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x.length);
        int[] y=IntStream.range(1,15).toArray();
        System.out.println(Arrays.toString(x));

        Integer[] xint= IntStream.of(x).boxed().toArray(Integer[]::new);
        List<Integer> listxint = Arrays.asList(xint);
        System.out.println(listxint);
        List<Integer> listxints = List.of(IntStream.of(y).boxed().toArray(Integer[]::new));
        System.out.println(listxints);
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(list);
        list.set(1,"orange");
        System.out.println(list);

        //we cannot add elements when Arrays.asList[] is assigned to List interface
        //not accepted;
       // list.add("fruit");
        System.out.println(list);

        //Traversing Array
        for(int item : y) {
            System.out.print(item);
        }

        String[] strings = {"gan","dev"};
        List<String> stringsArrL = Arrays.asList(strings);
        System.out.println(stringsArrL);
        stringsArrL.stream();
        Iterator<String> itrst = stringsArrL.listIterator();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println((Math.pow(2,32))-1);
        //Annonmoys array  -- new int[]{1,2,3} --  used for method parameters

        int[] arri = {2,3,0,5,4,7,0,5};

        Integer[] arrInt = IntStream.of(arri).boxed().sorted((xx,yy)->yy.compareTo(xx)).toArray(Integer[]::new);
        int jj=0;
        for(Integer item : arrInt) {
            arri[jj++]=item.intValue();
        }
        System.out.println(Arrays.toString(arri));

        IntStream.of(arri).boxed().sorted((xx,yy)->yy.compareTo(xx)).toArray();
    }
}
