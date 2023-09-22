package Lecture_1_OOPS_1.Complex_Number_Class.classes_and_objects;

public class ComplexUse 
{
    public static void main(String[] args) 
    {
        Complex c1 = new Complex(4, 5);
        c1.print();

        Complex c2 = new Complex(3, 1);
        c2.print();

        c1.add(c2);
        c1.print();
        c2.print();

        c1.setReal(4);
        c1.setImaginary(5);
        c2.setReal(1);
        c2.setImaginary(2);
        
        c1.multiply(c2);
        c1.print();
        c2.print();

        c1.conjugate();
        c1.print();


    }
}
