package hus.oop.lab2;

import java.util.Scanner;

public class TriangularPatternC {
    public static void triangularPatternC() {
        System.out.println("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int row = size; row >= 1; row--) {
            for (int col = size; col >= 1; col--) {
                if (row >= col) {
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
        triangularPatternC();
    }
}
