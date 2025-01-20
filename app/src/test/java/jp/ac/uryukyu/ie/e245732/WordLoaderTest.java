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

    @Test
    public void testLoadWordsFileNotFound() {
        List<String> words = WordLoader.loadWords();
        assertTrue(words.size() > 3);
        assertFalse(words.contains("test"));
    }

    @Test
    public void testLoadWordsContent() {
        List<String> words = WordLoader.loadWords();
        assertTrue(words.contains("apple"));
        assertTrue(words.contains("banana"));
    }
}