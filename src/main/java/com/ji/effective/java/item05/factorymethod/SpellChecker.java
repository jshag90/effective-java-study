package com.ji.effective.java.item05.factorymethod;

import com.ji.effective.java.item05.Dictionary;

import java.util.List;

/**
 * 팩터리 메서드 패턴 예제
 */
public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory){
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word){
        //TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo){
        return dictionary.closeWordsTo(typo);
    }

}
