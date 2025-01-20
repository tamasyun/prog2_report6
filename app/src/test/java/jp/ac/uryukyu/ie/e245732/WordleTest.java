package jp.ac.uryukyu.ie.e245732;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordleTest {
    @Test
    public void testjudgeExactMatch() {
        Wordle game = new Wordle();
        game.setAnswer("abcd");
        game.judge("abcd");
        assertEquals("○○○○", game.getJudgedGuess().get(0));
    }

    @Test
    public void testjudgePartialMatch() {
        Wordle game = new Wordle();
        game.setAnswer("abca");
        game.judge("aaaa");
        assertEquals("○**○", game.getJudgedGuess().get(0));
    }

    @Test
    public void testjudgeMixedMatch() {
        Wordle game = new Wordle();
        game.setAnswer("abca");
        game.judge("aaef");
        assertEquals("○△**", game.getJudgedGuess().get(0));
    }

    @Test
    public void testjudgeNoMatch() {
        Wordle game = new Wordle();
        game.setAnswer("abcd");
        game.judge("wxyz");
        assertEquals("****", game.getJudgedGuess().get(0));
    }

}
