package com.ji.effective.java.item05.dependencyinjection;

import com.ji.effective.java.item05.DefaultDictionary;

public class DictionaryFactory {
    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }
}
