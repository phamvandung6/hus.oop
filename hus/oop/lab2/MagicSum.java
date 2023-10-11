package hus.oop.lab2;

import java.util.Scanner;

public class MagicSum {
    public static void magicSum() {
        final int SENTINEL = -1;
        int num;

        System.out.print("Enter a positive integer(or -1 to end): ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        int sum = 0;
        while (num != SENTINEL) {
            if (HasEight.hasEight(num)) {
                sum += num;
            }
            System.out.print("Enter a positive integer(or -1 to end): ");
            num = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The magic sum is " + sum);
    }
    public static void main(String[] args) {
        magicSum();
    }
    
}
