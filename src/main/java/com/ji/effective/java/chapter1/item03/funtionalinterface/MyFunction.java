package com.ji.effective.java.chapter1.item03.funtionalinterface;

@FunctionalInterface
public interface MyFunction {
    String valueOf(Integer integer);

    static String hello(){
        return "hello";
    }
}
