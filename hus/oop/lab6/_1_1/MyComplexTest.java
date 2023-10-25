package hus.oop.lab6._1_1;

public class MyComplexTest {
    public static void main(String[] args) {
        // Create a MyComplex instance using the default constructor
        MyComplex complex1 = new MyComplex();
        System.out.println("Complex 1: " + complex1.toString()); // Expected output: (0.0 + 0.0i)

        // Create a MyComplex instance with real = 2.5 and imag = -1.5
        MyComplex complex2 = new MyComplex(2.5, -1.5);
        System.out.println("Complex 2: " + complex2.toString()); // Expected output: (2.5 + -1.5i)

        // Test getters and setters
        System.out.println("Real part of Complex 2: " + complex2.getReal()); // Expected output: 2.5
        System.out.println("Imaginary part of Complex 2: " + complex2.getImag()); // Expected output: -1.5
        complex2.setReal(3.0);
        complex2.setImag(2.0);
        System.out.println("Modified Complex 2: " + complex2.toString()); // Expected output: (3.0 + 2.0i)

        // Test setValue method
        complex1.setValue(1.0, 1.0);
        System.out.println("Modified Complex 1: " + complex1.toString()); // Expected output: (1.0 + 1.0i)

        // Test isReal and isImaginary methods
        System.out.println("Is Complex 1 real? " + complex1.isReal()); // Expected output: false
        System.out.println("Is Complex 1 imaginary? " + complex1.isImaginary()); // Expected output: false
        System.out.println("Is Complex 2 real? " + complex2.isReal()); // Expected output: false
        System.out.println("Is Complex 2 imaginary? " + complex2.isImaginary()); // Expected output: false

        // Test equals method
        System.out.println("Complex 1 equals Complex 2? " + complex1.equals(complex2)); // Expected output: false
        System.out.println("Complex 2 equals (3.0, 2.0)? " + complex2.equals(3.0, 2.0)); // Expected output: true

        // Test magnitude method
        System.out.println("Magnitude of Complex 1: " + complex1.magnitude()); // Expected output: 1.4142135623730951
        System.out.println("Magnitude of Complex 2: " + complex2.magnitude()); // Expected output: 3.605551275463989

        // Test addInto method
        complex1.addInto(complex2);
        System.out.println("Modified Complex 1 after addInto: " + complex1.toString()); // Expected output: (4.0 + 3.0i)

        // Test addNew method
        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of Complex 1 and Complex 2: " + sum.toString()); // Expected output: (7.0 + 5.0i)
    }
}