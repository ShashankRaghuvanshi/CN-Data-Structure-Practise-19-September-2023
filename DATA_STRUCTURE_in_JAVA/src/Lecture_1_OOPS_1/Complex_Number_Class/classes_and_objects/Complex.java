package Lecture_1_OOPS_1.Complex_Number_Class.classes_and_objects;

public class Complex 
{
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() 
    {
        return real;
    }
    public int getImaginary() 
    {
        return imaginary;
    }
    public void setReal(int real) 
    {
        this.real = real;
    }
    public void setImaginary(int imaginary) 
    {
        this.imaginary = imaginary;
    }
    public void print()
    {
        if(imaginary>=0)
        {
            System.out.println(real+" + "+"i"+imaginary);
        }
        else
        {
            System.out.println(real+" - "+"i"+(-1)*imaginary);
        }
    }

    public void add(Complex c2)
    {
        int r = this.real + c2.real;
        int i = this.imaginary + c2.imaginary;
        this.real = r;
        this.imaginary = i;
    }

    public void multiply(Complex c2)
    {
        int r = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        int i = (this.real * c2.imaginary)+ (this.imaginary * c2.real);
        this.real = r;
        this.imaginary = i;
    }
    
    public void conjugate()
    {
        this.real = this.real;
        this.imaginary = - this.imaginary;
    }
}
