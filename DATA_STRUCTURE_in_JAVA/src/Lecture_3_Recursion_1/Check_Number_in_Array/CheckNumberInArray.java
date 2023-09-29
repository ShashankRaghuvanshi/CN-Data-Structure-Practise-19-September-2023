package Lecture_3_Recursion_1.Check_Number_in_Array;

import java.util.Scanner;

public class CheckNumberInArray 
{
    public static boolean checkNumberInArray(int input[],int startIndex, int x)
    {
        if(startIndex == input.length)
        {
            return false;
        }
        if(input[startIndex] == x)
        {
            return true;
        }
        return checkNumberInArray(input, startIndex+1, x);
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
        System.out.println("Enter the number to search");
        int x = sc.nextInt();
        boolean ans = checkNumberInArray(array, 0, x);
        System.out.println(ans);

    }
}
