package hus.homework.week8._2._2_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a polynomial with coefficients stored as a list
 */
public class ListPoly extends AbstractPoly {
    private List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double coeff : coeffs) {
            coefficients.add(coeff);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoeffs = derive();
        return new ListPoly(derivativeCoeffs);
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.size()) {
            return coefficients.get(degree);
        } else {
            return 0.0;
        }
    }

    @Override
    public double[] coefficients() {
        double[] coeffsArr = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffsArr[i] = coefficients.get(i);
        }
        return coeffsArr;
    }
}