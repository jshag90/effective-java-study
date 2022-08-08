package com.ji.effective.java.chapter1.item05.dependencyinjection;

import com.ji.effective.java.chapter1.item05.DefaultDictionary;

public class DictionaryFactory {
    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }
}
