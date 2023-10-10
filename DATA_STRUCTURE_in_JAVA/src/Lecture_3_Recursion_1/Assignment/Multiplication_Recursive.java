package Lecture_3_Recursion_1.Assignment;

import java.util.Scanner;

public class Multiplication_Recursive 
{
    private static int multiplication(int M, int N, int startIndex)
    {
        if(startIndex == N)
        {
            return 0;
        }

        return M + multiplication(M, N, startIndex + 1);
    }

    public static int multiplication(int M, int N)
    {
        return multiplication(M, N, 0);
    }

    public static int multiplication_better(int M, int N)
    {
        if(M==0 || N==0)
        {
            return 0;
        }
        return M + multiplication_better(M, N-1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M ");
        int M = sc.nextInt();
        System.out.println("Enter N ");
        int N = sc.nextInt();
        int ans = multiplication(M, N);
        System.out.println(ans);
        int ans1 = multiplication_better(M, N);
        System.out.println(ans1);
        sc.close();
    }
}
