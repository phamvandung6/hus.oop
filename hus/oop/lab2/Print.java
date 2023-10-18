package hus.oop.lab2;

public class Print {

    public static void print(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
        }
        if (arr.length == 1) {
            System.out.println("[" + arr[0] + "]");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    System.out.print("[" + arr[i] + ", ");
                } else if (i == arr.length - 1) {
                    System.out.print(arr[i] + "]");
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
        }
    }

    public static void print(double[] array) {
        if (array.length == 0) {
            System.out.println("[]");
        } else if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i] + ", ");
                } else if (i == array.length - 1) {
                    System.out.print(array[i] + "]");
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }

    public static void print(float[] array) {
        if (array.length == 0) {
            System.out.println("[]");
        } else if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i] + ", ");
                } else if (i == array.length - 1) {
                    System.out.print(array[i] + "]");
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test with an empty array
        int[] emptyArray = new int[0];
        System.out.print("Printing empty array: ");
        print(emptyArray);
        System.out.println();

        // Test with a one-element array
        int[] oneElementArray = { 5 };
        System.out.print("Printing one-element array: ");
        print(oneElementArray);
        System.out.println();

        // Test with an n-element array
        double[] nElementArray = { 1, 2, 3.5, 4, 5 };
        System.out.print("Printing n-element array: ");
        print(nElementArray);
        System.out.println();
    }

}
