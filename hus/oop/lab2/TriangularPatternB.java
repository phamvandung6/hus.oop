package hus.oop.lab2;

import java.util.Scanner;

public class TriangularPatternB {
    public static void triangularPatternB() {
        System.out.println("Enter the size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = row; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        triangularPatternB();
    }
}
