package Lecture_3_Recursion_1.Recursion_and_PMI;

import java.util.Scanner;

public class SumOfNaturalNumbers 
{
    public static int sum(int n)
    {
        if(n == 1)                      //Base Case
        {
            return 1;
        }
        return sum(n-1) + n ;            //Smaller Problem & by using smaller problem how to solve the Bigger problem
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);
        sc.close();
    }
}
