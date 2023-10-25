package hus.oop.lab6._1_1;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex subtract(MyComplex right) {
        this.imag -= right.imag;
        this.real -= right.real;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        double newReal = this.real - right.real;
        double newImag = this.imag - right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex multiply(MyComplex right) {
        double newReal = (this.real * right.real) - (this.imag * right.imag);
        double newImag = (this.real * right.imag) + (this.imag * right.real);
        return new MyComplex(newReal, newImag);
    }

    public MyComplex divide(MyComplex right) {
        double divisor = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / divisor;
        double newImag = (this.imag * right.real - this.real * right.imag) / divisor;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex conjugate() {
        double newImag = -this.imag;
        return new MyComplex(this.real, newImag);
    }
}
