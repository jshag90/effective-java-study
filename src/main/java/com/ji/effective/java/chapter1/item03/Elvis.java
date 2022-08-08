package com.ji.effective.java.chapter1.item03;

public class Elvis {

    /**
     *  싱글톤 오브젝트
     */
    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing(){
        System.out.println("I'll have a blue~ Chritmas without you~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
