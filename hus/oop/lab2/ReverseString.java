package hus.oop.lab2;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
       StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print("The reversed String is: " + reverseString(str));
        scanner.close();
    }
}
