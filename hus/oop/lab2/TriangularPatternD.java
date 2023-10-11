package hus.oop.lab2;

import java.util.Scanner;

public class TriangularPatternD {
    public static void triangularPatternD() {
        System.out.println("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = size; col >= 1; col--) {
                if (col > row) {
                    System.out.print("  ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }

        scanner.close();

    }

    public static void main(String[] args) {
        triangularPatternD();
    }
}
