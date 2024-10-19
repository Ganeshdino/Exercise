package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new Person("ganesh",35).age());

        RecordEx recordEx = new RecordEx("mahadev", 11);

        System.out.println(recordEx.toString());
        System.out.println(recordEx);

        System.out.println("no.of processers: " + Runtime.getRuntime().availableProcessors());
    }
}