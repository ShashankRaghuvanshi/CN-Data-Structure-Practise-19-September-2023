package Lecture_3_Recursion_1.Recursion_and_Arrays_Continue;

public class CheckSortedBetter 
{
    //This function checks if the array is sorted from startIndex to end
    public static boolean checkSortedBetter(int input[], int startIndex)
    {
        if(startIndex >= input.length -1)
        {
            return true;
        }
        if(input[startIndex] > input[startIndex + 1])
        {
            return false;
        }
        boolean smallAns = checkSortedBetter(input, startIndex + 1);
        return smallAns;
    }

    public static void main(String[] args) 
    {
        int input[] = {2,1,3,6,9};
        //int input[] = {1,2,3,6,9};
        System.out.println(checkSortedBetter(input, 0));
    }
}

//IMPORTANT NOTE
// 1 Base Case
// 2 (n-1) or smaller problem solution
// 3 update/processing
// order of 2 & 3 may change according to need