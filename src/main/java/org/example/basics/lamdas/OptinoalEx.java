package org.example.basics.lamdas;

import java.util.Optional;

public class OptinoalEx {

    public static void main(String[] args) {



        /*Optional<String> strr = optionalString.map(str->"mapped");
        System.out.println(strr.orElse("d"));*/
        /*throws NoSuchElementException when using Optional.ofNullable(null)
        * Optional.ofNullable(null) provide Empty optional
        * */
        String sNullable = "null";
        Optional<String> optionalStringNullable = Optional.ofNullable(sNullable);
        //System.out.println(optionalStringNullable.get());
        optionalStringNullable.ifPresent(System.out::println);
       // optionalStringNullable.orElseThrow();
        //optionalStringNullable.orElse("dkd");
        //optionalStringNullable.orElseGet(()->"default");  -- uses supplier fn.
       // optionalStringNullable.orElseThrow(()->{throw new NullPointerException( );});
        Runnable r = System.out::println;
       optionalStringNullable.ifPresent(System.out::println);
        optionalStringNullable.ifPresentOrElse(System.out::println,r);


        /*throws null pointer exception when using Optional.of(null)*/
        String s = null;
        Optional<String> optionalString = Optional.of(s);
        System.out.println(optionalString.get());

    }
}
