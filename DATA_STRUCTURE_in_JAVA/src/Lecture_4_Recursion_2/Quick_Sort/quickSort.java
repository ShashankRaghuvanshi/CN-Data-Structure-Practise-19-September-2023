package Lecture_4_Recursion_2.Quick_Sort;

import java.util.Scanner;

public class quickSort 
{
    public static int partitionArray(int input[], int start, int end)
    {
        //chose pivot
        int pivot = input[start];

        //count elements smaller than pivot and swap
        int count = 0;
        for(int i = start + 1; i <= end; i++)
        {
            if(input[i] <= pivot)
            {
                count++;
            }
        }
        int pivotIndex = start + count;
        int temp = input[start];
        input[start] = input[pivotIndex];
        input[pivotIndex] = temp;

        //ensure left half contains elements smaller than pivot
        //and right half larger
        int i = start;
        int j = end;
        while(i <= pivotIndex && j >= pivotIndex)
        {
            while(i <= pivotIndex && input[i] <= pivot)
            {
                i++;
            }
            while(j >= pivotIndex && input[j] > pivot)
            {
                j--;
            }
            if(i < pivotIndex && j > pivotIndex)
            {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void quickSort(int input[], int start, int end)
    {
        if(start >= end)
        {
            return;
        }
        int pivotIndex = partitionArray(input, start, end);
        quickSort(input , start , pivotIndex - 1);
        quickSort(input, pivotIndex + 1, end);
    }

    public static void quickSort(int input[])
    {
        quickSort(input, 0, input.length-1);
        return;
    }


    public static int[] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int input[] = new int[size];
        for(int i=0; i<size; i++)
        {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void printArray(int[] ans)
    {
        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int []array = takeInput();
        quickSort(array);
        printArray(array);
    }
}
