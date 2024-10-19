package org.example.basics.functional;

import java.util.function.Function;

public class FunConcepts {
    public static void main(String[] args) {
        Function<Integer,Integer> a = i-> i;
        //chaining
        //calc.add(10).subtract(2).multiply(5).getResult()
        int t = 4;
        Function<Integer, Integer> f1 = x->x+10;
        Function<Integer,Integer> f2 = y->y-5;
        Function<Integer,Integer> f3 = z->z*5;
        Integer chainres = f1.andThen(f2).andThen(f3).apply(t);
        System.out.println("chaining "+ chainres);

        //composition
        Integer compres = f1.compose(f2).compose(f3).apply(t);
        System.out.println("composition "+ compres);

        //currying
        Function<Integer,Function<Integer,  Function<Integer,Integer>>> curry =
                                            c1 -> c2 ->c3 -> c1 + c2 + c3;
        Integer curryout = curry.apply(10).apply(20).apply(30);
        System.out.println("curryout: " + curryout);

    }
}
