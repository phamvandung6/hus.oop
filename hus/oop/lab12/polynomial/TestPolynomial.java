package hus.oop.lab12.polynomial;

public class TestPolynomial {
  public static void main(String[] args) {
    /*
     * - Chạy demo các hàm test.
     */
    testArrayPolynomial();
    System.out.println();
    testListPolynomial();
    System.out.println();
    testRootSolver();

    /*
     * output
     * Polynomial p1: [2.0 + -4.0x^1 + 3.0x^2]
     * Polynomial p2: [1.0 + -5.0x^1 + 2.0x^2]
     * Sum of p1 and p2: [3.0 + -9.0x^1 + 5.0x^2]
     * Difference of p1 and p2: [1.0 + 1.0x^1 + 1.0x^2]
     * Product of p1 and p2: [2.0 + -14.0x^1 + 27.0x^2 + -23.0x^3 + 6.0x^4]
     * Value of p1 at x = 2.5: 10.75
     * 
     * Polynomial p1: [2.0 + -4.0x^1 + 3.0x^2]
     * Polynomial p2: [1.0 + -5.0x^1 + 2.0x^2]
     * Sum of p1 and p2: [3.0 + -9.0x^1 + 5.0x^2]
     * Difference of p1 and p2: [1.0 + 1.0x^1 + 1.0x^2]
     * Product of p1 and p2: [2.0 + -14.0x^1 + 27.0x^2 + -23.0x^3 + 6.0x^4]
     * Value of p1 at x = 2.5: 10.75
     * 
     * Bisection method:
     * Polynomial: [4.0 + -4.0x^1 + 1.0x^2]
     * Root: 1.9921875
     * 
     * Newton-Raphson method:
     * Polynomial: [4.0 + -4.0x^1 + 1.0x^2]
     * Root: 1.9921875
     * 
     * Secant method:
     * Polynomial: [4.0 + -4.0x^1 + 1.0x^2]
     * Root: 2.0
     */
  }

  public static void testArrayPolynomial() {
    /*
     * - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào
     * đa thức, xóa phần tử trong đa thức,
     * sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức,
     * tính giá trị của đa thức khi biết
     * giá trị của x).
     */
    ArrayPolynomial p1 = new ArrayPolynomial();
    p1.append(2);
    p1.append(-4);
    p1.append(3);

    ArrayPolynomial p2 = new ArrayPolynomial();
    p2.append(1);
    p2.append(-5);
    p2.append(2);

    System.out.println("Polynomial p1: " + p1);
    System.out.println("Polynomial p2: " + p2);

    ArrayPolynomial sum = p1.plus(p2);
    System.out.println("Sum of p1 and p2: " + sum);

    ArrayPolynomial difference = p1.minus(p2);
    System.out.println("Difference of p1 and p2: " + difference);

    ArrayPolynomial product = p1.multiply(p2);
    System.out.println("Product of p1 and p2: " + product);

    double x = 2.5;
    double value = p1.evaluate(x);
    System.out.println("Value of p1 at x = " + x + ": " + value);
  }

  public static void testListPolynomial() {
    /*
     * - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào
     * đa thức, xóa phần tử trong đa thức,
     * sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức,
     * tính giá trị của đa thức khi biết
     * giá trị của x).
     */
    ListPolynomial p1 = new ListPolynomial();
    p1.append(2);
    p1.append(-4);
    p1.append(3);

    ListPolynomial p2 = new ListPolynomial();
    p2.append(1);
    p2.append(-5);
    p2.append(2);

    System.out.println("Polynomial p1: " + p1);
    System.out.println("Polynomial p2: " + p2);

    ListPolynomial sum = p1.plus(p2);
    System.out.println("Sum of p1 and p2: " + sum);

    ListPolynomial difference = p1.minus(p2);
    System.out.println("Difference of p1 and p2: " + difference);

    ListPolynomial product = p1.multiply(p2);
    System.out.println("Product of p1 and p2: " + product);

    double x = 2.5;
    double value = p1.evaluate(x);
    System.out.println("Value of p1 at x = " + x + ": " + value);
  }

  public static void testRootSolver() {
    /*
     * - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
     * - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho
     * (Bisection, Newton-Raphson, Secant) sử dụng
     * PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời
     * gian chạy chương trình.
     * - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
     */

    double tolerance = 0.0001;
    int maxIterations = 10000;

    ArrayPolynomial poly = new ArrayPolynomial();
    poly.append(4);
    poly.append(-4);
    poly.append(1);

    double a = -2;
    double b = 2;

    PolynomialRootFinding rootFinding = new PolynomialRootFinding(poly);

    // Bisection method
    rootFinding.setRootSolver(new BisectionSolver(tolerance, maxIterations));
    double rootBisection = rootFinding.solve(a, b);
    System.out.println("Bisection method:");
    System.out.println("Polynomial: " + poly);
    System.out.println("Root: " + rootBisection);
    System.out.println();

    // Newton-Raphson method
    rootFinding.setRootSolver(new NewtonRaphsonSolver(tolerance, maxIterations));
    double rootNewtonRaphson = rootFinding.solve(a, b);
    System.out.println("Newton-Raphson method:");
    System.out.println("Polynomial: " + poly);
    System.out.println("Root: " + rootNewtonRaphson);
    System.out.println();

    // Secant method
    rootFinding.setRootSolver(new SecantSolver(tolerance, maxIterations));
    double rootSecant = rootFinding.solve(a, b);
    System.out.println("Secant method:");
    System.out.println("Polynomial: " + poly);
    System.out.println("Root: " + rootSecant);
  }
}
