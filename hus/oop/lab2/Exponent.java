package hus.oop.lab2;

import java.util.Scanner;

public class Exponent {
    public static int exponent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        scanner.close();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(exponent());
    }
}
