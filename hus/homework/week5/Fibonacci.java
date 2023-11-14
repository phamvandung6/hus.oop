package hus.homework;

public class Fibonacci {
    public static int finbonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return finbonacci(n - 1) + finbonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(finbonacci(10));
    }
}
