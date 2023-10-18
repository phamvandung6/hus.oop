package hus.homework;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        final String SECRET_WORD = "testing";

        boolean[] arr = new boolean[SECRET_WORD.length()];
        StringBuilder guessWord = new StringBuilder(SECRET_WORD.length());
        for (int i = 0; i < SECRET_WORD.length(); i++) {
            guessWord.append("_");
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Key in one character or your guess word: ");
            char c = scanner.next().charAt(0);

            for (int i = 0; i < SECRET_WORD.length(); i++) {
                if (SECRET_WORD.charAt(i) == c) {
                    arr[i] = true;
                }
            }

            for (int i = 0; i < SECRET_WORD.length(); i++) {
                if (arr[i]) {
                    guessWord.setCharAt(i, SECRET_WORD.charAt(i));
                }
            }

            System.out.println(guessWord);
            if (guessWord.toString().equals(SECRET_WORD)) {
                break;
            }

        }
        scanner.close();
    }
}