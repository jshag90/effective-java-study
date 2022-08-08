package com.ji.effective.java.chapter1.item05.factorymethod;

import com.ji.effective.java.chapter1.item05.DefaultDictionary;
import com.ji.effective.java.chapter1.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory{
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
