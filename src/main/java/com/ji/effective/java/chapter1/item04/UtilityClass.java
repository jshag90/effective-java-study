package com.ji.effective.java.chapter1.item04;

public class UtilityClass {

   // private UtilityClass(){
      //  throw new AssertionError();
   // }

    public static String hello(){ return "hello";}

    public static void main(String[] args) {
        String hello = UtilityClass.hello();

        UtilityClass utilityClass = new UtilityClass();
        utilityClass.hello();
    }
}