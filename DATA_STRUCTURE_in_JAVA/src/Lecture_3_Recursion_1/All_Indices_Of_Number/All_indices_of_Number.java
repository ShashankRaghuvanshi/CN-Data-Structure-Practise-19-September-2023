package Lecture_3_Recursion_1.All_Indices_Of_Number;

import java.util.Scanner;

public class All_indices_of_Number 
{
    private static int[] all_indices_of_Number(int input[], int x, int startIndex)
    {
        if(startIndex == input.length)
        {
            int output[] = new int[0];
            return output;
        }

        int smallOutput[] = all_indices_of_Number(input, x, startIndex+1);
        
        if(input[startIndex] == x)
        {
            int output[] = new int[smallOutput.length + 1];
            output[0] = startIndex;
            for(int i=0; i<smallOutput.length; i++)
            {
                output[i+1] = smallOutput[i];
            }
            return output;
        }
        else
        {
            return smallOutput;
        }
    }

    public static int[] all_indices_of_Number(int input[], int x)
    {
        return all_indices_of_Number(input, x, 0);
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

    public static void printArray(int input[])
    {
        for(int i=0; i<input.length; i++)
        {
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int array[] = takeInput();
        System.out.println("Enter the integer x");
        int x = sc.nextInt();
        int ans[] = all_indices_of_Number(array, x);
        printArray(ans);
    }
}
