package Lecture_3_Recursion_1.Recursion_and_Arrays;

public class CheckSorted 
{
    public static boolean checkSorted(int input[])
    {
        if(input.length <= 1)
        {
            return true;
        }

        int smallInput[] = new int[input.length - 1];
        for(int i=1; i<input.length; i++)
        {
            smallInput[i-1] = input[i];
        }

        boolean smallAns = checkSorted(smallInput);
        if(!smallAns)
        {
            return false;
        }
        if(input[0] <= input[1])
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkSorted_2(int input[])
    {
        if(input.length <= 1)
        {
            return true;
        }

        if(input[0] > input[1])
        {
            return false;
        }

        int smallInput[] = new int[input.length - 1];
        for(int i=1; i<input.length; i++)
        {
            smallInput[i-1] = input[i];
        }

        boolean smallAns = checkSorted_2(smallInput);
        return smallAns;
        // if(smallAns)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }

    }


    public static void main(String[] args) 
    {
        // int input[] = {2,1,3,6,9};
        int input[] = {1,2,3,6,9};
        System.out.println(checkSorted(input));
        System.out.println(checkSorted_2(input));
    }
}

//IMPORTANT NOTE
// 1 Base Case
// 2 (n-1) or smaller problem solution
// 3 update/processing
// order of 2 & 3 may change according to need