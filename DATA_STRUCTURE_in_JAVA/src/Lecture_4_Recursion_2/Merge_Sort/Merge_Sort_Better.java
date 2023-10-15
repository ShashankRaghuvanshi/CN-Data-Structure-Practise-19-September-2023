package Lecture_4_Recursion_2.Merge_Sort;

import java.util.Scanner;

public class Merge_Sort_Better 
{
    public static void mergeSort(int a[])
    {
        //base case
        if(a.length <= 1)
        {
            return;
        }

        //split array into two parts by length
        int b[]  = new int[a.length / 2];
        int c[] = new int[a.length - b.length];

        //put value of input array into 1st part
        for(int i=0; i<a.length/2; i++)
        {
            b[i] = a[i];
        }
        
        //put value of input array into 2nd part
        for(int i = a.length/2; i<a.length; i++)
        {
            c[i - a.length/2] = a[i];
        }

        //call recursively 1st part
        mergeSort(b);

        //call recursively 2nd part
        mergeSort(c);

        //after sorting merge to part
        merge(b, c, a);
    }

    public static void merge(int []p1, int []p2, int []a)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        //Merge two sorted arrays
        while(i < p1.length && j < p2.length)
        {
            if(p1[i] <= p2[j])
            {
                a[k] = p1[i];
                i++;
                k++;
            }
            else
            {
                a[k] = p2[j];
                k++;
                j++;
            }
        }

        if(i < p1.length)
        {
            while(i < p1.length)
            {
                a[k] = p1[i];
                i++;
                k++;
            }
        }

        if(j < p2.length)
        {
            while(j < p2.length)
            {
                a[k] = p2[j];
                j++;
                k++;
            }
        }
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
        mergeSort(array);
        printArray(array);
    }
}
