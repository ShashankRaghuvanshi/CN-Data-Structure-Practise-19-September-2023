package Lecture_3_Recursion_1.Introduction_To_Recursion.Calculating_Factorial;

import java.util.Scanner;

public class Factorial 
{
    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int smallAns = fact(n-1);
        return n * smallAns;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        sc.close();
    }
}
