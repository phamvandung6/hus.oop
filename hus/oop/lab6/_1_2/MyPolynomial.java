package hus.oop.lab6._1_2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i > 0) {
                sb.append(coeffs[i]).append("x^").append(i).append(" + ");
            } else {
                sb.append(coeffs[i]);
            }
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int maxLength = Math.max(coeffs.length, another.coeffs.length);
        double[] resultCoeffs = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            double thisCoeff = (i < coeffs.length) ? coeffs[i] : 0;
            double anotherCoeff = (i < another.coeffs.length) ? another.coeffs[i] : 0;
            resultCoeffs[i] = thisCoeff + anotherCoeff;
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int resultDegree = getDegree() + another.getDegree();
        double[] resultCoeffs = new double[resultDegree + 1];
        for (int i = 0; i <= getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }
}