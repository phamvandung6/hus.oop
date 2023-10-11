package hus.oop.lab2;

import java.util.Scanner;

public class CountVowelsDigits {

    public static int isVowle(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char x = Character.toLowerCase(str.charAt(i));
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    public static boolean isVowel(char c) {
        char c_ = Character.toLowerCase(c);
        return c_ == 'a' || c_ == 'e' || c_ == 'i' || c_ == 'o' || c_ == 'u';
    }

    public static void countVowelsDigits(String str) {
        int vowelCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char x = Character.toLowerCase(str.charAt(i));
            if (isDigit(x)) {
                digitCount++;
            }
            if (isVowel(x)) {
                vowelCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Digits: " + digitCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        scanner.close();
        countVowelsDigits(str);
    }
}
