package hus.oop.lab2;

public class Swap {
    public static boolean swap(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int[] temp;
            temp = CopyOf.copyOf(arr1);
            arr1 = CopyOf.copyOf(arr2);
            arr2 = CopyOf.copyOf(temp);
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        System.out.println(swap(arr1, arr2));
    }

}