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
    public boolean judge(String word){
        ArrayList<Character> answerCharsLeft = new ArrayList<>(this.answerChars);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) { //文字も場所も一致
            char c = word.charAt(i);
            if (answerCharsLeft.get(i) == c) {
                sb.append("○");
                answerCharsLeft.set(i, null);
            } else {
                sb.append(" ");
            }
        }
        for (int i = 0; i < word.length(); i++) {//文字は一致、場所は不一致
            char c = word.charAt(i);
            if (sb.charAt(i) == ' ') {
                if (answerCharsLeft.contains(c)) {
                    sb.setCharAt(i, '△');
                    answerCharsLeft.set(answerCharsLeft.indexOf(c), null);
                }
            }
        }
        judgedGuess.add(sb.toString());
        guessed.add(word);
        if(word.equals(answer)){
            return true;
        }else{
            return false;
        }
    }

    public void printGuesses(){
        for (int i = 0; i < guessed.size(); i++) {
            System.out.println(judgedGuess.get(i));
            System.out.println(guessed.get(i));
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------\n<英単語を推測せよ>");
        System.out.println("(ルール)\n○:文字も場所も一致\n△:文字は一致、場所は不一致");
        for (int i = 0; i < 6; i++) {
            System.out.printf("--------- %d/6 --------\n",i+1);
            printGuesses();
            String guess;
            while(true) {
                System.out.printf("%d文字の単語を入力: ", answer.length());
                guess = scanner.next();
                if (guess.length() == answer.length()) {
                    break;
                } else {
                    System.out.println("(再度入力してください。)");
                }
            }
            if(judge(guess)){
                break;
            }
        }
        System.out.println("正解は「" + answer + "」でした。");
    }
}
