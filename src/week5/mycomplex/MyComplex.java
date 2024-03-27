package week5.mycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
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
        return imag == 0;
    }
    public boolean isImaginary() {
        return real == 0;
    }
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }
    public boolean equals(MyComplex another) {
        return equals(another.getReal(), another.getImag());
    }
    public double magnitude() {
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }
    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }
}
