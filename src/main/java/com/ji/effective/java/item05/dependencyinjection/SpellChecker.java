package com.ji.effective.java.item05.dependencyinjection;

import com.ji.effective.java.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public SpellChecker(Supplier<Dictionary> dictionarySupplier){
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word){
        //TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo){
        return dictionary.closeWordsTo(typo);
    }

}
