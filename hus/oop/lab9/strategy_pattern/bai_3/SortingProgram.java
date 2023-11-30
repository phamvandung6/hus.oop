package hus.oop.lab9.strategy_pattern.bai_3;

import java.util.Arrays;

public class SortingProgram {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 6, 1, 3, 9, 4, 7 };

        // Create the context object
        SortContext context = new SortContext();

        // Set the strategy based on user input or configuration
        SortingStrategy strategy = new BubbleSort();
        context.setStrategy(strategy);

        // Sort the array using the selected strategy
        context.sortArray(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}