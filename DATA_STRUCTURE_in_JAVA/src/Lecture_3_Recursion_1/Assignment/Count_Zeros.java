package Lecture_3_Recursion_1.Assignment;

import java.util.Scanner;

public class Count_Zeros 
{
    //First Method
    public static int countZeros(int n, int count)
    {
        if(n == 0)
        {
            return count;
        }
        if(n % 10 == 0)
        {
            ++count;
        }
        int smallAns = countZeros(n/10, count);
        return smallAns;
    }

    public static int countZeros(int n)
    {
        return countZeros(n, 0);
    }

    //Second Method
    public static int countZeros_2(int input)
    {
        if(input < 10)
        {
            if(input == 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(input % 10 == 0)
        {
            return countZeros_2(input/10)+1;
        }
        else
        {
            return countZeros_2(input/10);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = countZeros(n);
        System.out.println(ans);

        int ans2 = countZeros_2(n);
        System.out.println(ans2);

        sc.close();
    }
}
