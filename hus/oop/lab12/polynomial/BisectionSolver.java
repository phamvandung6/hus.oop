package hus.oop.lab12.polynomial;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * 
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * 
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double mid = 0.0;
        int iterations = 0;

        while (iterations <= maxIterations) {
            mid = (lower + upper) / 2.0;
            if (Math.abs(polynomial.evaluate(mid)) <= tolerance) {
                return mid;
            }
            if (polynomial.evaluate(lower) * polynomial.evaluate(mid) < 0) {
                upper = mid;
            } else {
                lower = mid;
            }
            iterations++;
        }

        return mid;
    }
}
