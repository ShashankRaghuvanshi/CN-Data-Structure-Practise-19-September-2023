package Lecture_3_Recursion_1.Assignment;

import java.util.Scanner;

public class Sum_of_digits_Recursive 
{
    public static int sumDigits(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return sumDigits(n/10) + (n%10);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = sumDigits(n);
        System.out.println(ans);
        sc.close();
    }
}
