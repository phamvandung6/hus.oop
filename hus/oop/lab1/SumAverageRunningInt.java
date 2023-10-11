package hus.oop.lab1;

public class SumAverageRunningInt {
    static int count = 0;
    final static int LOWERBOUND = 1;
    final static int UPPERBOUND = 100;

    public static double sum() {
        double sum = 0;
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sum += i;
        }
        return sum;
    }

    public static double average(double sum, int count) {
        return sum / count;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum());
        System.out.println("Average: " + average(sum(), UPPERBOUND - LOWERBOUND + 1));
    }
}
