package Lecture_3_Recursion_1.Sum_of_Array;

import java.util.Scanner;

public class Sum_of_Array 
{
    //First method
    public static int sumOfArray(int []input, int startIndex)
	{
		if(startIndex == input.length)
		{
			return 0;
		}
		return input[startIndex] + sumOfArray(input, startIndex+1);
		
	}

    //second method
    public static int sumOfArray(int input[])
    {
        //Base Case
        if(input.length == 1)
        {
            return input[0];
        }

        //Smaller problem
        int smallArrayLength = input.length -1;
        int[] smallArray = new int[smallArrayLength];
        for(int i=0; i<smallArrayLength; i++)
        {
            smallArray[i] = input[i];
        }

        return sumOfArray(smallArray) + input[smallArrayLength];
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
        sc.close();
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
        int array[] = takeInput();
        printArray(array);
        int sumOfArray = sumOfArray(array);
        System.out.println(sumOfArray);

        System.out.println(sumOfArray(array, 0));

    }
}
