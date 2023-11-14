package hus.homework.week8._2._2_3;

import java.util.Arrays;
import java.util.Objects;

/**
 * An abstract class providing an implementation for shared parts of ArrayPoly
 * and ListPoly
 */
public abstract class AbstractPoly implements Poly {

    double[] derive() {
        int degree = degree();
        double[] derivativeCoeffs = new double[degree];
        for (int i = 1; i <= degree; i++) {
            derivativeCoeffs[i - 1] = coefficient(i) * i;
        }
        return derivativeCoeffs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AbstractPoly that = (AbstractPoly) o;
        return Arrays.equals(coefficients(), that.coefficients());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = degree();
        for (int i = degree; i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0.0) {
                if (sb.length() > 0) {
                    if (coeff > 0.0) {
                        sb.append(" + ");
                    } else {
                        sb.append(" - ");
                        coeff = Math.abs(coeff);
                    }
                } else if (coeff < 0.0) {
                    sb.append("-");
                    coeff = Math.abs(coeff);
                }
                if (i == 0 || coeff != 1.0) {
                    sb.append(coeff);
                }
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }
}