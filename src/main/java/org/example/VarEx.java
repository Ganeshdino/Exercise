package org.example;

import java.util.function.BiFunction;

public class VarEx {
    private static BiFunction<Integer, Integer, Integer> s = (a, b) -> a + b;

    public static void main(String[] args) {
        var s1 =s;
        int x = s1.apply(5,6);
        System.out.println(x);
    }
}
