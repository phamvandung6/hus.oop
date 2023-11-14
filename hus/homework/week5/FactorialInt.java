package hus.homework;

public class FactorialInt {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i <= 1000; i++) {
            if ((Integer.MAX_VALUE / factorial) < i) {
                System.out.println("The factorial of " + i + " out of range.");
                break;
            } else {
                System.out.println("Factorial of " + i + " is " + factorial);
            }
            factorial *= i;
        }
    }
}