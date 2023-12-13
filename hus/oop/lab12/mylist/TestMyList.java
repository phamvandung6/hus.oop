package hus.oop.lab12.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ
         * vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList myList = new MyArrayList();
        myList.append(10.5);
        myList.append(20.3);
        myList.append(15.7);
        myList.append(18.2);

        BasicStatistic statistic = new BasicStatistic(myList);
        double max = statistic.max();
        double min = statistic.min();
        double mean = statistic.mean();
        double variance = statistic.variance();

        System.out.println("Data: " + myList);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
    }

    public static void testMyLinkedList() {
        /*
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ
         * vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList myList = new MyLinkedList();
        myList.append(8.4);
        myList.append(12.9);
        myList.append(10.1);
        myList.append(9.7);

        BasicStatistic statistic = new BasicStatistic(myList);
        double max = statistic.max();
        double min = statistic.min();
        double mean = statistic.mean();
        double variance = statistic.variance();

        System.out.println("Data: " + myList);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
    }
}
