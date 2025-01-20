package jp.ac.uryukyu.ie.e245732;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wordle {
    private String answer;
    private ArrayList<Character> answerChars;
    private ArrayList<String> guessed;
    private ArrayList<String> judgedGuess;
    private List<String> words;
    Wordle() {
        Random rand = new Random();
        List<String> words = WordLoader.loadWords("app/src/main/java/jp/ac/uryukyu/ie/e245732/WordList.txt");
        this.words = words;
        this.answer = words.get(rand.nextInt(words.size()));
        this.answerChars = new ArrayList<>();
        for (char c : answer.toCharArray()) {
            answerChars.add(c);
        }
        this.guessed = new ArrayList<>();
        this.judgedGuess = new ArrayList<>();
    }
    public void judge(String word){
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (answerChars.get(0) == c) {
                sb.append("○");
            } else if (answerChars.contains(c)) {
                System.out.print("△");
            } else {
                sb.append(" ");
            }
        }
        judgedGuess.add(sb.toString());
    }

    public void printGuesses(){
        for (int i = 0; i < guessed.size(); i++) {
            System.out.println(judgedGuess.get(i));
            System.out.println(guessed.get(i));
        }
    }
}
