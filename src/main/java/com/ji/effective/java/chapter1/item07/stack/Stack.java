package com.ji.effective.java.chapter1.item07.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){elements = new Object[DEFAULT_INITIAL_CAPACITY];}

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    private void ensureCapacity(){
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2*size*1);
    }

    public Object pop(){
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size ] = null;
        return result;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for(String arg: args)
            stack.push(arg);

        while(true)
            System.err.println(stack.pop());
    }
}
