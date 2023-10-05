package Lecture_3_Recursion_1.Last_Index_of_Number;

import java.util.Scanner;

public class LastIndex 
{
    private static int lastIndex(int input[], int x, int endIndex)
    {
        if(endIndex < 0)
        {
            return -1;
        }
        if(input[endIndex] ==  x)
        {
            return endIndex;
        }
        
        return lastIndex(input, x, endIndex - 1);
    }

    public static int lastIndex(int input[], int x)
    {
        return lastIndex(input, x, input.length-1);
    }

    private static int lastIndex_2(int input[], int x, int startIndex)
    {
        if(startIndex == input.length)
        {
            return -1;
        }
        
        int smallAns = lastIndex_2(input, x, startIndex + 1);

        if(smallAns != -1)
        {
            return smallAns;
        }
        if(input[startIndex] ==  x)
        {
            return startIndex;
        }
        else
        {
            return -1;
        }
    }

    public static int lastIndex_2(int input[], int x)
    {
        return lastIndex_2(input, x, 0);
    }

    public static int[] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int size = sc.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the Array elements ");
        for(int i=0; i<size; i++)
        {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int array[] = takeInput();
        System.out.println("Enter the integer x");
        int x = sc.nextInt();

        int ans = lastIndex(array, x);
        System.out.println(ans);

        int ans1 = lastIndex_2(array, x);
        System.out.println(ans1);
    }
}
