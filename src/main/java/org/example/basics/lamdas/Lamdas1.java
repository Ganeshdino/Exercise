package org.example.basics.lamdas;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.function.Function;

public class Lamdas1 {
    private String value = "value";

    public Lamdas1() {

    }
    public static void main(String[] args) {
        int l;
        l=10;
        //l= l +1;  --not allowed
        Lamdas1 lamdas1 = new Lamdas1();
        lamdas1.setValue("ganesh");
        Function<Lamdas1, Integer> fn = (lamdas)->{
            /* int l=30; */
           // l = l + 1;
            var fnx = 30;
            fnx = fnx+1;
            var s = lamdas.getValue();
            s = s.concat(" appended");
            System.out.println(String.format("%s is a final string",s));
            return Integer.valueOf(fnx);
        };
       // l = l + 1;
        lamdas1.setValue("d");
        System.out.println(fn.apply(lamdas1));
        lamdas1.setValue("x");
        lamdas1.processFn(fn);
        lamdas1.processSupp(()->null);
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {

        this.value =  value;
    }


    public void processFn(Function<Lamdas1,Integer> fn) {
        Lamdas1 lamdas1 = new Lamdas1();
        lamdas1.setValue("dde");
        Integer ret = fn.apply(lamdas1);
        System.out.println(ret);
    }

    public void processSupp(Supplier<Integer> s){
        System.out.println(s.get());
        Optional<Integer> opt = Optional.ofNullable(s.get());

        System.out.printf("process supp %s%n", opt.orElseGet(() -> 0));
       // System.out.println(opt.get()); //should not directly call get method - nosuchelmeent exception
        Optional<String> optStr = Optional.of(null); // throws nullpointer exception
        //System.out.println(optStr.get()); // should not directly call -

        try {
            Objects.requireNonNull(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
