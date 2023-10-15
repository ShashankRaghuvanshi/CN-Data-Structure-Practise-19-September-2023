package Lecture_4_Recursion_2;

import java.util.Scanner;

public class Remove_Duplicates_Recursively 
{
    public static String remove_Duplicates_Recursively(String input)
    {
        if(input.length() <= 1)
        {
            return input;
        }
        if(input.charAt(0) == input.charAt(1))
        {
            return remove_Duplicates_Recursively(input.substring(1));
        }
        return input.charAt(0) + remove_Duplicates_Recursively(input.substring(1));
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        String ans = remove_Duplicates_Recursively(input);
        System.out.println(ans);
        sc.close();
    }
}
