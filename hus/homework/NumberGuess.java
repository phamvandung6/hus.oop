package hus.homework;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Key in your guess");
        int count = 0;
        while (true) {
            count++;

            int guess = scanner.nextInt();
            if (guess == SECRET_NUMBER) {
                break;
            } else if (guess > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
        }
        System.out.println("You got it in " + count + " trials");
        scanner.close();
    }
}
