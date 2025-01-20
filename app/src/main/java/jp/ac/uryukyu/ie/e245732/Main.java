package jp.ac.uryukyu.ie.e245732;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        Wordle wordle = new Wordle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("ゲームを選択\n1:Hangman \n2:Wordle\n入力: ");
        int select = scanner.nextInt();
        if (select == 1) {
            hangman.play();
        } else if (select == 2) {
            wordle.play();
        }
        scanner.close();
    }
}
