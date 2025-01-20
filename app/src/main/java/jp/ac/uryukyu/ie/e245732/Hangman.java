package jp.ac.uryukyu.ie.e245732;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Hangman {
    private String answer;
    private ArrayList<Character> answerChars;
    private ArrayList<Character> guessed;
    private List<String> words;

    Hangman() {
        Random rand = new Random();
        List<String> words = loadWords("src/main/java/jp/ac/uryukyu/ie/e245732/WordList.txt");
        this.words = words;
        this.answer = words.get(rand.nextInt(words.size()));
        this.answerChars = new ArrayList<>();
        for (char c : answer.toCharArray()) {
            answerChars.add(c);
        }
        this.guessed = new ArrayList<>();
    }

    public List<String> loadWords(String file) {
        try {
            return Files.readAllLines(Paths.get(file));
        } catch (IOException e) {
            System.out.println(e);
            return List.of("test");
        }
    }

    public boolean judgeCharacter(char c) {
        if (answerChars.contains(c) && !guessed.contains(c)) {
            guessed.add(c);
            return true;
        } else {
            return false;
        }
    }

    public String printQuestion() {
        StringBuilder sb = new StringBuilder();
        for (char c : answer.toCharArray()) {
            if (guessed.contains(c)) {
                sb.append(c);
            } else {
                sb.append("_");
            }
        }
        return sb.toString();
    }
    public void setAnswer(String answer){
        this.answer = answer;
        this.answerChars = new ArrayList<>();
        for (char c : answer.toCharArray()) {
            answerChars.add(c);
        }
        this.guessed = new ArrayList<>(); 
    }
    public List<String> getWords(){
        return words;
    }

}
