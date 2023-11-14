package hus.homework;

public class NumberSequence {
    public static int lengOfSeq(int n) {
        if (n == 1) {
            return 1;
        } else {
            return lengOfSeq(n - 1) + String.valueOf(n).length();
        }
    }
    public static void main(String[] args) {
        System.out.println(lengOfSeq(10));
    }
}
