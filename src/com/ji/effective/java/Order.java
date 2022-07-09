package com.ji.effective.java;

import java.util.Arrays;

public class Order {

    private boolean prime;

    private boolean urgent;

    private OrderStatus orderStatus;

//    private int status;
//
//    private final int PREPARING = 0;
//    private final int SHIPPED = 2;

    public static void main(String[] args) {

        Order order = new Order();
        if(order.orderStatus == OrderStatus.DELIVERED){
            System.out.println("delivered");
        }

        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

        // Quiz : hashmap 대신 enumset, enummap을 사용하면 좋은점은???
        // answer : hashmap도 다른 방식 보다 Hash값을 가지고 관리 하기 때문에 검색 속도가 빠르지만
        // key를 찾는 과정에서 해싱 작업을 해야한다(key를 hash값으로 변환)
        // 하지만 enummap을 사용하게 되면 enum을 단일 객체임을 보장하기 때문에 해싱작업을 할 필요가 없다.
        // 그러므로 hashmap보다 enummap이 검색속도가 더 빠르게 동작한다.
    }

}
