package hus.oop.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void result() {
        final int NUM_STUDENTS = 3;

        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 0 - 100: ");
            numberIn = scanner.nextInt();
            if (numberIn >= 0 && numberIn <= 100) {
                isValid = true;
                if (isValid) {
                    sum += numberIn;
                }
            } else {
                System.out.println("Invalid number. Try again.");
            }
            scanner.close();
        }
        average = sum / NUM_STUDENTS;
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        result();
    }
}
