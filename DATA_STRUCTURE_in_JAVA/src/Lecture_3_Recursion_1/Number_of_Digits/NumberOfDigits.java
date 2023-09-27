package Lecture_3_Recursion_1.Number_of_Digits;

import java.util.Scanner;

public class NumberOfDigits 
{
    public static int numberOfDigits(int n)
    {
        return (int)(Math.log10(n) + 1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int ans = numberOfDigits(n);
        System.out.println(ans);
        sc.nextInt();
    }
}
