package com.ji.effective.java.chapter1.item02;

import java.util.Arrays;

/**
 * 완벽 공략 10 - 가변 인수
 */
public class VarargsSamples {

    public void printNumbers(int... numbers){
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        Arrays.stream(numbers).forEach(System.out::println);
    }

    //Heap pollution
    public static void main(String[] args) {
        VarargsSamples samples = new VarargsSamples();
        samples.printNumbers(5, 10);
    }
}
