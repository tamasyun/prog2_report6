package jp.ac.uryukyu.ie.e245732;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class WordLoaderTest {

    @Test
    public void testLoadWordsSuccess() {
        List<String> words = WordLoader.loadWords();
        assertNotNull(words);
        assertFalse(words.isEmpty());
    }
}