package hus.oop.lab3;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        System.out.print("Enter the oct String: ");
        Scanner scanner = new Scanner(System.in);
        String oct = scanner.nextLine();
        scanner.close();
        for (int i = oct.length() - 1; i >= 0; i--) {
            char c = oct.charAt(i);
            if (!((c >= '0' && c <= '7'))) {
                System.out.println("Invalid oct string: " + oct);
                return;
            }
        }
        String result = ConvertNumber.convertFromBaseToBase(oct, 8, 10);
        System.out.println("Result: " + result);
    }
}
