package com.ji.effective.java;

public interface HelloService {

    String hello();

    //정적 메서드
    static String hi(){
        prepareMessage();
        return "hi";
    }

    //자부 9에서 생긴 private한 정적 메서드
    static private void prepareMessage(){
    }

    static String hi1(){
        prepareMessage();
        return "hi";
    }

    static String hi2(){
        prepareMessage();
        return "hi";
    }

    //java 8 부터 새로 나옴
    //정적 메서드 사용 가능
    //해당 인터페이스를 구현한 모든 클래스에서 다음 메서드를 사용가능함
    default String bye(){
        return "bye";
    }

    //Quiz comparator를 이용해서 정렬

}
