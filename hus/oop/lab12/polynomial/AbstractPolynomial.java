package hus.oop.lab12.polynomial;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * 
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] coefficients = coefficients();
        int degree = degree();

        sb.append('[');
        for (int i = 0; i <= degree; i++) {
            double coefficient = coefficients[i];

            if (i == 0) {
                sb.append(coefficient);
            } else {
                sb.append(" + ");
                sb.append(coefficient);
                sb.append("x^");
                sb.append(i);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /*
     * Lấy đạo hàm đa thức.
     * 
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */

    public double[] differentiate() {
        double[] coefficients = coefficients();
        int degree = degree();

        double[] derivativeCoefficients = new double[degree];

        for (int i = 1; i <= degree; i++) {
            derivativeCoefficients[i - 1] = coefficients[i] * i;
        }

        return derivativeCoefficients;
    }
}
