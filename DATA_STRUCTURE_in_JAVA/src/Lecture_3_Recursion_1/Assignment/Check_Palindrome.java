package Lecture_3_Recursion_1.Assignment;

import java.util.Scanner;

public class Check_Palindrome 
{
    private static boolean checkPalindrome(String str, int startIndex, int endIndex)
    {
        if(startIndex >= endIndex)
        {
            return true;
        }
        if(str.charAt(startIndex) != str.charAt(endIndex))
        {
            return false;
        }
        boolean smallAns = checkPalindrome(str, startIndex+1, endIndex-1);
        return smallAns;
    }

    public static boolean checkPalindrome(String str)
    {
        return checkPalindrome(str, 0, str.length()-1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input String");
        String str = sc.nextLine();

        boolean ans = checkPalindrome(str);
        System.out.println(ans);

        sc.close();
    }

}
