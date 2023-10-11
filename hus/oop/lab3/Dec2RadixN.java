package hus.oop.lab3;

import java.util.Scanner;

public class Dec2RadixN {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        System.out.print("Enter the radix to convert: ");
        int n = scanner.nextInt();
        scanner.close();

        String result = ConvertNumber.convertFromBaseToBase(number, 10, n);
        System.out.println("The equilavent hexadecimal number is: " + result);
    }
}
