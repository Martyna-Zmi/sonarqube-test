import org.example.WordAnalyzer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordAnalyzerTest {
    @Test
    public void shouldCount2Vowels(){
        String word = "higher";
        assertEquals(2, WordAnalyzer.countVowels(word));
    }
    @Test
    public void shouldCount4Consonants(){
        String word = "small";
        assertEquals(4, WordAnalyzer.countConsonants(word));
    }
    @Test
    public void shouldHandleUppercase(){
        String word = "KeyBoARdSmASh";
        assertEquals(4, WordAnalyzer.countVowels(word));
        assertEquals(9, WordAnalyzer.countConsonants(word));
    }
}
