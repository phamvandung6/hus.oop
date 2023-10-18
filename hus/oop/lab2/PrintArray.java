package hus.oop.lab2;

import java.util.Scanner;

public class PrintArray {
    public static void printArray() {
        final int NUM_ITEMS;
        int[] items;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = scanner.nextInt();
        items = new int[NUM_ITEMS];

        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = scanner.nextInt();
            }
        }

        System.out.print("The values are: ");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("[" + items[i] + ", ");
            } else if (i == items.length - 1) {
                System.out.print(items[i] + "]");
            } else {
                System.out.print(items[i] + ", ");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        printArray();
    }

}
