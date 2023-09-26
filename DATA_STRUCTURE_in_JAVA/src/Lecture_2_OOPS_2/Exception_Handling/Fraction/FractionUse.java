package Lecture_2_OOPS_2.Exception_Handling.Fraction;

public class FractionUse 
{
    public static void main(String[] args) //throws ZeroDenominatorException
    {
        Fraction f1 = new Fraction(20,30);
        f1.print();

        f1.setNumerator(12);
        int d = f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);

        //exception handling
        try
        {
            f1.setDenominator(0);        
            //once exception came after that no line will execute in try block
            //if there is no exception, then it will execute other line in try block
        }
        catch(ZeroDenominatorException e)
        {
            //it will only in case of exception
            System.out.println("Hey don't input 0 as denominator ");
        }
        finally
        {
            //this code will execute no matter what
        }


        
        f1.print();

        Fraction f2 = new Fraction(3, 4);
        f1.add(f2);
        f1.print();
        f2.print();

        Fraction f3 = new Fraction(4,5);
        f3.multiply(f2);
        f3.print();
        f2.print();

        Fraction f4 = Fraction.add(f1,f3);
        f1.print();
        f3.print();
        f4.print();
    }
}
