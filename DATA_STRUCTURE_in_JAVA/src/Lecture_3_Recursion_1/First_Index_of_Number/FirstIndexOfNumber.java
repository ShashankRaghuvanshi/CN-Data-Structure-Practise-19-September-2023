package Lecture_3_Recursion_1.First_Index_of_Number;

import java.util.Scanner;

public class FirstIndexOfNumber 
{
    private static int firstIndex(int input[], int x, int startIndex)
    {
        if(startIndex == input.length)
        {
            return -1;
        }
        if(input[startIndex] ==  x)
        {
            return startIndex;
        }
        
        return firstIndex(input, x, startIndex + 1);
    }

    public static int firstIndex(int input[], int x)
    {
        return firstIndex(input, x, 0);
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
        int ans = firstIndex(array, x);
        System.out.println(ans);
    }
}
