package hus.oop.lab2;

import java.util.Scanner;

public class CheckHexStr {
    public static void checkHexStr() {
        System.out.print("Enter a hex String: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.matches("^[0-9a-fA-F]+$")) {
            System.out.println(str + " is a hex String");
        } else {
            System.out.println(str + " is not a hex String");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        checkHexStr();
    }
}
