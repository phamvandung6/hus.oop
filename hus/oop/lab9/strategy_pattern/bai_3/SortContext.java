package hus.oop.lab9.strategy_pattern.bai_3;

public class SortContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] arr) {
        strategy.sort(arr);
    }
}
