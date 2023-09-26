package Lecture_1_OOPS_1.Polynomial_Class.classes_and_objects;

import java.util.Scanner;

public class PolynomialUse 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Size of degree for Polynomial first ");
        int n = s.nextInt();

        int degree1[] = new int[n];
        System.out.println("Enter the degree size for each x for Polynomial first ");
        for(int i=0; i<n; i++)
        {
            degree1[i] = s.nextInt();
        }

        int coeff1[] = new int[n];
        System.out.println("Enter the coefficient for each x for Polynomial first ");
        for(int i=0; i<n; i++)
        {
            coeff1[i] = s.nextInt();
        }

        Polynomial first = new Polynomial();
        for(int i=0; i<n; i++)
        {
            first.setCoefficient(degree1[i], coeff1[i]);
        }

        System.out.println("Size of degree for Polynomial second ");
        n = s.nextInt();

        int degree2[] = new int[n];
        System.out.println("Enter the degree size for each x for Polynomial second ");
        for(int i=0; i<n; i++)
        {
            degree2[i] = s.nextInt();
        }

        int coeff2[] = new int[n];
        System.out.println("Enter the coefficient for each x for Polynomial second ");
        for(int i=0; i<n; i++)
        {
            coeff2[i] = s.nextInt();
        }

        Polynomial second = new Polynomial();
        for(int i=0; i<n; i++)
        {
            second.setCoefficient(degree2[i], coeff2[i]);
        }

        System.out.println("Enter the choice 1 for addition, 2 for subtraction, 3 for multiply ");
        int choice = s.nextInt();
        Polynomial result;
        switch(choice)
        {
            case 1:
            {
                result = first.add(second);
                result.print();
                break;
            }
            case 2:
            {
                result = first.subtract(second);
                result.print();
                break;
            }
            case 3:
            {
                result = first.multiply(second);
                result.print();
            }
        }
        s.close();

    }
}
