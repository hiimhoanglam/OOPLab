package week4.classes.ex17;

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
        return "(" + this.real + " + " + this.imag + "i)";
    }
    public boolean isReal() {
        return imag == 0;
    }
    public boolean isImaginary() {
        return real == 0;
    }
    public boolean equals(double real, double imag) {
        return Math.abs(this.real - real) < 1e-8 && Math.abs(this.imag - imag) < 1e-8;
    }
    public double magnitude() {
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }
    public double argument() {
        return Math.atan2(imag,real);
    }
    public MyComplex add(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(),
                this.imag + right.getImag());
    }
    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(),
                this.imag + right.getImag());
    }
    public MyComplex multiply(MyComplex right) {
        double newReal = (this.real * right.getReal() - this.imag * right.getImag());
        double newImag = (this.real * right.getImag() + this.imag * right.getReal());
        this.setReal(newReal);
        this.setImag(newImag);
        return this;
    }
    public MyComplex divide(MyComplex right) {
        double denominator = right.getReal() * right.getReal() + right.getImag() + right.getImag();
        double real = (this.getReal() * right.getReal() + this.getImag() * right.getImag()) / denominator;
        double imag = (this.getReal() * (-1) * right.getImag() + this.getImag() * right.getReal()) / denominator;
        this.setReal(real);
        this.setImag(imag);
        return this;
    }
    public MyComplex conjugate() {
        this.imag = - this.imag;
        return this;
    }

}
