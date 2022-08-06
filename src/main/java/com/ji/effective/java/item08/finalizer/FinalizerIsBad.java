package com.ji.effective.java.item08.finalizer;

public class FinalizerIsBad {

    protected void finalize() throws Throwable{
        System.out.println("");
    }
}
