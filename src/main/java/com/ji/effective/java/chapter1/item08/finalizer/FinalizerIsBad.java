package com.ji.effective.java.chapter1.item08.finalizer;

public class FinalizerIsBad {

    protected void finalize() throws Throwable{
        System.out.println("");
    }
}
