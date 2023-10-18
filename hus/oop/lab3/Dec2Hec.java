package hus.oop.lab3;

import java.util.Scanner;

public class Dec2Hec {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        scanner.close();
        String result = ConvertNumber.convertFromBaseToBase(number, 10, 16);
        System.out.println("The equilavent hexadecimal number is: " + result);
    }
}
