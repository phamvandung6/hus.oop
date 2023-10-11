package hus.oop.lab3;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        System.out.print("Enter the hex String: ");
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.nextLine();
        scanner.close();
        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                System.out.println("Invalid hex string: " + hex);
                return;
            }
        }
        String result = ConvertNumber.convertFromBaseToBase(hex, 16, 2);
        System.out.println("Result: " + result);
    }
}
