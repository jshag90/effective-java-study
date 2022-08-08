package com.ji.effective.java.chapter1.item05.factorymethod;

import com.ji.effective.java.chapter1.item05.Dictionary;
import com.ji.effective.java.chapter1.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
