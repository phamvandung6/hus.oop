package hus.oop.lab12.polynomial;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        this.coefficients = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * 
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * 
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        double[] copy = new double[size];
        System.arraycopy(coefficients, 0, copy, 0, size);
        return copy;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * 
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        if (size == coefficients.length) {
            enlarge();
        }
        coefficients[size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * 
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (size == coefficients.length) {
            enlarge();
        }

        System.arraycopy(coefficients, index, coefficients, index + 1, size - index);
        coefficients[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * 
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * 
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * 
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        double power = 1;

        for (int i = 0; i < size; i++) {
            result += coefficients[i] * power;
            power *= x;
        }

        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * 
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < size; i++) {
            derivative.append(coefficients[i] * i);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int maxSize = Math.max(size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double sum = coefficient(i) + another.coefficient(i);
            result.append(sum);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int maxSize = Math.max(size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double difference = coefficient(i) - another.coefficient(i);
            result.append(difference);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * 
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int newSize = size + another.size - 1;
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < newSize; i++) {
            result.append(0);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < another.size; j++) {
                double product = coefficient(i) * another.coefficient(j);
                result.coefficients[i + j] += product;
            }
        }
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] newCoefficients = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, newCoefficients, 0, size);
        coefficients = newCoefficients;
    }
}
