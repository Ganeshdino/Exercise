package org.example.basics.string;

import java.util.Locale;

public class StringForEach {
    public static void main(String[] args) {
        String str = "afADFASEas";
        for(char c : str.toCharArray()) {
            System.out.println(c);
        }
        String s = "comma";
        System.out.println(s.toLowerCase(Locale.CHINESE));

        String word = "welcome";
        String newword = word.substring(0,word.length());
        System.out.println(newword);


    }



}
