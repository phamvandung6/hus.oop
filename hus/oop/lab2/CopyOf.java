package hus.oop.lab2;

import java.util.Arrays;

public class CopyOf {
    public static int[] copyOf(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(copyOf(arr)));
    }
    
}
