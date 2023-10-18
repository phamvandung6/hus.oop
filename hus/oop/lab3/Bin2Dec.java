package hus.oop.lab3;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        System.out.print("Enter the binary string: ");
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();
        scanner.close();

        for (int i = binary.length() - 1; i >= 0; i--) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                System.out.println("Invalid binary string: " + binary);
                return;
            }
        }
        String result = ConvertNumber.convertFromBaseToBase(binary, 2, 10);
        System.out.println("Result: " + result);
    }
}
