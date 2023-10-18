package hus.oop.lab1;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n to calculate factorial: ");
        int n = scanner.nextInt();
        System.out.println(("Factorial of " + n + " is " + factorial(n)));
        scanner.close();
    }
}
