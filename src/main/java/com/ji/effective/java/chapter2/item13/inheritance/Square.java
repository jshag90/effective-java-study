package com.ji.effective.java.chapter2.item13.inheritance;

import me.whiteship.chapter02.item13.inheritance.Shape;

/**
 * p84, p126 일반적으로 상속용 클래스에 Cloneable 인터페이스 사용을 권장하지 않는다.
 * 해당 클래스를 확장하려는 프로그래머에게 많은 부담을 주기 때문이다.
 */
public class Square extends Shape {

    private int length, height;

    public Square(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        me.whiteship.chapter02.item13.inheritance.Square square = new me.whiteship.chapter02.item13.inheritance.Square(10, 2);
        me.whiteship.chapter02.item13.inheritance.Square copy = (me.whiteship.chapter02.item13.inheritance.Square) square.clone();
        System.out.println(copy.getArea());
    }

    @Override
    public int getArea() {
        return this.length * this.height;
    }

}
