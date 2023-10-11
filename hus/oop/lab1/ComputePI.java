package hus.oop.lab1;

public class ComputePI {
    final static int MAX_DOMINATOR = 100000;

    public static double callPi() {
        int count = 1;
        double sum = 0;
        for (int i = 1; i <= MAX_DOMINATOR; i += 2) {
            count++;
            sum = sum + Math.pow(-1, count) * 1 / i;
        }
        return sum * 4;
    }

    public static void main(String[] args) {
        System.out.println("Pi ~ " + callPi());
    }
}
