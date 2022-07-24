package item05;

import com.ji.effective.java.item05.DefaultDictionary;
import com.ji.effective.java.item05.dependencyinjection.SpellChecker;
import org.junit.Test;

public class SpellCheckerTest {

    @Test
    void isValid(){
        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        spellChecker.isValid("test");
    }

}
