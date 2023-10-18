package hus.oop.lab2;

import java.util.Arrays;

public class Reverse {
    public static void reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];

        }
        System.out.println(Arrays.toString(reverse));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
    }
}
