package hus.oop.lab12.polynomial;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double x0 = (lower + upper) / 2;
        double x = x0;
        int iterations = 0;
        double fx = polynomial.evaluate(x);
        double derivative = polynomial.derivative().evaluate(x);
        
        while (Math.abs(fx) > tolerance && iterations < maxIterations) {
            x = x - fx / derivative;
            fx = polynomial.evaluate(x);
            derivative = polynomial.derivative().evaluate(x);
            iterations++;
        }
        
        return x;
    }
}
