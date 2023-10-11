package hus.homework;

import java.util.Scanner;

public class TestPalindromicWord {
    public static boolean testPalindromicWord(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Nhap Chuoi: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (testPalindromicWord(str)) {
            System.out.println("\"" + str + "\" is a palindrome");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome");
        }
        scanner.close();
    }
}
