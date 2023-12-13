package hus.oop.lab12.polynomial;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double x0 = lower;
        double x1 = upper;
        double fx0 = polynomial.evaluate(x0);
        double fx1 = polynomial.evaluate(x1);
        double x = 0;
        double fx = 0;
        int iterations = 0;

        while (Math.abs(x1 - x0) > tolerance && iterations < maxIterations) {
            x = x1 - (fx1 * (x1 - x0)) / (fx1 - fx0);
            fx = polynomial.evaluate(x);

            x0 = x1;
            fx0 = fx1;
            x1 = x;
            fx1 = fx;

            iterations++;
        }

        return x;
    }
}
