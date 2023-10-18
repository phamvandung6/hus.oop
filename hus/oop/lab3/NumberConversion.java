package hus.oop.lab3;
import java.util.Scanner;

public class NumberConversion {
    public static String toRadix(String in, int inRadix, int outRadix) {
        return ConvertNumber.convertFromBaseToBase(in, inRadix, outRadix);
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        System.out.print("Enter the input radix: ");
        int inRadix = scanner.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = scanner.nextInt();
        scanner.close();
        System.out.println(in + " in radix " + inRadix + " is " + toRadix(in, inRadix, outRadix) + " in radix " +
         outRadix);
    }
}
