package hus.homework;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        grades = new int[n];

        readGrades(n);
        print(grades);

        System.out.println("The average is: " + average(grades));
        System.out.println("The median is: " + median(grades));
        System.out.println("The minimum is: " + minimum(grades));
        System.out.println("The maximum is: " + maximum(grades));
        System.out.println("The standard deviation is: " + standardDeviation(grades));
        scanner.close();
    }

    public static void readGrades(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades[i] = grade;
        }
        scanner.close();
    }

    public static void print(int[] arr) {
        System.out.println("The grades are: " + Arrays.toString(arr));
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return Math.round(sum / arr.length * 100.0) / 100.0;
    }

    public static double standardDeviation(int[] arr) {
        double average = average(arr);
        double sum = 0;
        for (int i : arr) {
            sum += Math.pow(i - average, 2);
        }
        return Math.round(Math.sqrt(sum / arr.length) * 100.0) / 100.0;
    }

    public static double median(int[] arr) {
        Arrays.sort(arr);

        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }
    }

    public static int minimum(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int maximum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}
