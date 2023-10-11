package Lecture_3_Recursion_1.Assignment;

import java.util.Scanner;

public class Geometric_Sum 
{
    public static double gerometric_sum(int k)
    {
        if(k == 0)
        {
            return 1;
        }
        return gerometric_sum(k-1) + 1 / Math.pow(2, k);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer k value");
        int k = sc.nextInt();
        double ans = gerometric_sum(k);
        System.out.println(ans);

        sc.close();
    }
}
