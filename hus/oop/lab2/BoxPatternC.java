package hus.oop.lab2;

import java.util.Scanner;

public class BoxPatternC {
    public static void boxPatternC() {
        System.out.println("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == (size - col + 1)) {
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
        boxPatternC();
    }
}
