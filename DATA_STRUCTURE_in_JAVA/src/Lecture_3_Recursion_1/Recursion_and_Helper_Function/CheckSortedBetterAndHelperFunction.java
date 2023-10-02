package Lecture_3_Recursion_1.Recursion_and_Helper_Function;

public class CheckSortedBetterAndHelperFunction 
{
    //This function checks if the array is sorted from startIndex to end
    private static boolean checkSortedBetter(int input[], int startIndex)
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

    public static boolean checkSortedBetter(int input[])
    {
        return checkSortedBetter(input, 0);
    }

    public static void main(String[] args) 
    {
        int input[] = {2,1,3,6,9};
        //int input[] = {1,2,3,6,9};
        System.out.println(checkSortedBetter(input));
    }
}
