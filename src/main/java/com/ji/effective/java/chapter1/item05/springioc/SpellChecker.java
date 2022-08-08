package com.ji.effective.java.chapter1.item05.springioc;

import com.ji.effective.java.chapter1.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public boolean isValid(String word){
        //TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo){
        return dictionary.closeWordsTo(typo);
    }
}
