package hus.oop.lab2;

import java.util.Scanner;

public class BoxPatternD {
    public static void boxPatternD() {
        System.out.println("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == (size - col + 1) || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        boxPatternD();
    }
}
