package Lecture_4_Recursion_2.Merge_Sort;

import java.util.Scanner;

//Divide and Conquer
public class Merge_Sort 
{
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

    private static void merge_Sort(int[] input, int start, int end)
    {
        if(start >= end)
        {
            return;
        }

        int mid = (start + end) / 2;

        //Part_1
        merge_Sort(input, start, mid);

        //Part_2
        merge_Sort(input, mid+1, end);

        merge_Sort(input, start, mid, end);
    }

    public static void merge_Sort(int[] input, int start, int mid, int end)
    {
        int num1 = mid - start + 1;
        int num2 = end - mid;

        int []part_1 = new int[num1];
        int []part_2 = new int[num2];

        for(int i=0; i<num1; ++i)
        {
            part_1[i] = input[start + i];
        }
        for(int j=0; j<num2; ++j)
        {
            part_2[j] = input[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while(i < num1 && j < num2)
        {
            if(part_1[i] < part_2[j])
            {
                input[k] = part_1[i];
                i++;
            }
            else
            {
                input[k] = part_2[j];
                j++;
            }
            k++;
        }

        while(i < num1)
        {
            input[k] = part_1[i];
            i++;
            k++;
        }
        while(j < num2)
        {
            input[k] = part_2[j];
            j++;
            k++;
        }
    }

    public static void merge_Sort(int[] input)
    {
        merge_Sort(input, 0, input.length-1);
        return;
    }

    public static void main(String[] args) 
    {
        int []array = takeInput();
        merge_Sort(array);
        printArray(array);
    }
}
