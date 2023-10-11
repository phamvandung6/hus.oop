package hus.oop.lab1;

public class TrigonometricSeries {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double sin(double x, int numTerm) {
        int count = 0;
        double result = 0;
        for (int i = 1; i < 2 * numTerm; i += 2) {
            result += (Math.pow(x, i) / factorial(i)) * Math.pow(-1, count);
            count++;
        }
        return result;
    }

    public static double cos(double x, int numTerm) {
        int count = 0;
        double result = 0;
        for (int i = 0; i < 2 * numTerm; i += 2) {
            result += (Math.pow(x, i) / factorial(i)) * Math.pow(-1, count);
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("---Sin(x)---");
        System.out.println("Me: " + sin(0.76, 10));
        System.out.println("Computer" + Math.sin(0.76));
        System.out.println("---Cos(x)---");
        System.out.println("Me: " + cos(0.76, 10));
        System.out.println("Computer: " + Math.cos(0.76));
    }
}
