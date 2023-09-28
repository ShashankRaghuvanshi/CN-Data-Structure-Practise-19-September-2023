package Lecture_3_Recursion_1.Fibonacci_Number;

import java.util.Scanner;

public class Fibonacci_Number 
{
    public static int fib(int n)
    {
        if((n == 0) || (n == 1))
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Fibonacci term ");
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
        sc.close();
    }
}
