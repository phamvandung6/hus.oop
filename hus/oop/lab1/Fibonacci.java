package hus.oop.lab1;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void print() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(fibonacci(i));
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The first 20 Fibonanci number: ");
        print();
    }
}
