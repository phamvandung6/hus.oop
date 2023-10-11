package hus.oop.lab2;

import java.util.Scanner;

public class HasEight {
    public static boolean hasEight(int number) {
        String numberString = Integer.toString(number);
        return numberString.contains("8");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(hasEight(number));
        scanner.close();
    }

}
