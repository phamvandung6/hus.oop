package hus.oop.lab1;

import java.util.Scanner;

public class ExtractDigits {
    public static String extractDigits(int num) {
        String result = "";
        int last;
        while (num > 0) {
            last = num % 10;
            result = result + last + " ";
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = scanner.nextInt();
        System.out.println(extractDigits(n));
        scanner.close();
    }
}
