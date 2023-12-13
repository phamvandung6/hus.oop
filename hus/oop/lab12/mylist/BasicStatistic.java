package hus.oop.lab12.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * 
     * @return giá trị lớn nhất.
     */
    public double max() {
        double maxValue = Double.MIN_VALUE;
        MyIterator iterator = data.iterator();

        while (iterator.hasNext()) {
            double value = (double) iterator.next();
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * 
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        double minValue = Double.MAX_VALUE;
        MyIterator iterator = data.iterator();

        while (iterator.hasNext()) {
            double value = (double) iterator.next();
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * 
     * @return kỳ vọng.
     */
    public double mean() {
        double sum = 0;
        int count = 0;
        MyIterator iterator = data.iterator();

        while (iterator.hasNext()) {
            double value = (double) iterator.next();
            sum += value;
            count++;
        }

        return sum / count;
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * 
     * @return phương sai.
     */
    public double variance() {
        double mean = mean();
        double sumOfSquaredDifferences = 0;
        int count = 0;
        MyIterator iterator = data.iterator();

        while (iterator.hasNext()) {
            double value = (double) iterator.next();
            double difference = value - mean;
            sumOfSquaredDifferences += difference * difference;
            count++;
        }

        return sumOfSquaredDifferences / count;
    }
}
