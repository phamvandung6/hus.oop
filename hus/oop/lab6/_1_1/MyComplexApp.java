package hus.oop.lab6._1_1;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + complex1.toString());
        System.out.println("Number 1 is " + (complex1.isReal() ? "" : "NOT ") + "a pure real number");
        System.out.println("Number 1 is " + (complex1.isImaginary() ? "" : "NOT ") + "a pure imaginary number");

        System.out.println("Number 2 is: " + complex2.toString());
        System.out.println("Number 2 is " + (complex2.isReal() ? "" : "NOT ") + "a pure real number");
        System.out.println("Number 2 is " + (complex2.isImaginary() ? "" : "NOT ") + "a pure imaginary number");

        System.out.println(complex1.equals(complex2) ? "Number 1 is equal to Number 2" : "Number 1 is NOT equal to Number 2");

        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of Number 1 and Number 2: " + sum.toString());

        MyComplex difference = complex1.subtractNew(complex2);
        System.out.println("Difference of Number 1 and Number 2: " + difference.toString());

        MyComplex product = complex1.multiply(complex2);
        System.out.println("Product of Number 1 and Number 2: " + product.toString());

        MyComplex quotient = complex1.divide(complex2);
        System.out.println("Quotient of Number 1 and Number 2: " + quotient.toString());

        double argument1 = complex1.argument();
        System.out.println("Argument of Number 1: " + argument1);

        double argument2 = complex2.argument();
        System.out.println("Argument of Number 2: " + argument2);

        MyComplex conjugate1 = complex1.conjugate();
        System.out.println("Conjugate of Number 1: " + conjugate1.toString());

        MyComplex conjugate2 = complex2.conjugate();
        System.out.println("Conjugate of Number 2: " + conjugate2.toString());

        scanner.close();
    }
}