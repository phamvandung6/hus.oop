package hus.oop.lab3;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = scanner.nextInt();
        System.out.print("Enter the string: ");
        String number = scanner.next();
        scanner.close();
        String result = ConvertNumber.convertFromBaseToBase(number, radix, 10);
        System.out.println("The equilavent decimal number is: " + result);
    }
}
