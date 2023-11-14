package hus.homework.week8._2._2_3;

/**
 * Class representing a polynomial with coefficients stored as an array of
 * doubles
 */
public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoeffs = derive();
        return new ListPoly(derivativeCoeffs);
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.length) {
            throw new IllegalArgumentException("Invalid degree");
        }
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients.clone();
    }
}