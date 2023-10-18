package hus.oop.lab3;

public class BinarySearch {
    public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
        if (fromIdx == toIdx - 1) {
            return array[fromIdx] == key;
        }
        int midIdx = (fromIdx + toIdx) / 2;
        int midValue = array[midIdx];
        if (midValue == key){
            return true;
        } else if (midValue > key){
            return binarySearch(array, key, fromIdx, midIdx - 1);
        } else {
            return binarySearch(array, key, midIdx + 1, toIdx);
        }
    }

    public boolean binarySearch(int[] array, int key){
        return binarySearch(array, key, 0, array.length - 1);
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(array, 5));
    }
}
