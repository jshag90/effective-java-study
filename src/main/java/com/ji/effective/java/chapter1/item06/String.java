package com.ji.effective.java.chapter1.item06;

public class String {

    public static void main(String[] args) {
        java.lang.String hello = "hello";

        //TODO 이 방법은 권장하지 않습니다.
        java.lang.String hello2 = new java.lang.String("hello");

        java.lang.String hello3 = "hello";

        System.out.println(hello == hello2);
        System.out.println(hello.equals(hello2));
        System.out.println(hello == hello3);
        System.out.println(hello.equals(hello3));
    }
}
