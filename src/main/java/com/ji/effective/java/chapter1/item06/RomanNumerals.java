package com.ji.effective.java.chapter1.item06;

import java.util.regex.Pattern;

public class RomanNumerals {
    // 성능을 훨씬 더 끌어올릴 수 있다.
    static boolean isRomanNumeralSlow(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 값비싼 객체를 재상요해 성능을 개선한다.
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) { return ROMAN.matcher(s).matches();}

    public static void main(String[] args) {
        boolean result = false;
        long start = System.nanoTime();
        for(int j=0; j < 100; j++){
            result = isRomanNumeralSlow("MCMLXXVI");
        }

        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(result);

    }
}
