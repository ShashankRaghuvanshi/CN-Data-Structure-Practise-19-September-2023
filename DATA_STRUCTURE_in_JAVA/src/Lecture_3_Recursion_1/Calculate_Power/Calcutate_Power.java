package Lecture_3_Recursion_1.Calculate_Power;

import java.util.Scanner;

public class Calcutate_Power 
{
    public static int calculatePower(int x, int n)
    {
        if(x == 0 && n == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 1;
        }
        return x * calculatePower(x, n-1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x");
        int x = sc.nextInt();
        System.out.println("Enter the power n ");
        int n = sc.nextInt();
        int ans = calculatePower(x, n);
        System.out.println(ans);
    }
}
