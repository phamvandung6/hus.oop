package hus.oop.lab1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int numberIn;
        boolean isValid = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a number between 0 - 100: ");
            numberIn = scanner.nextInt();
            if (numberIn >= 0 && numberIn <= 100) {
                isValid = true;
            } else {
                System.out.println("Invalid number. Try again.");
            }
        } while (!isValid);
        scanner.close();
    }
}
