package hus.oop.lab1;

import java.util.Scanner;

public class ReverseInt {
    public static int reverse(int num) {
        int last = 0;
        int result = 0;
        while (num > 0) {
            last = num % 10;
            result = result * 10 + last;
            num = num / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();
        System.out.println(reverse(n));
        scanner.close();
    }
}
