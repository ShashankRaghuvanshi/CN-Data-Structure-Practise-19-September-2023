package Lecture_4_Recursion_2.Recrursion_and_Strings;

import java.util.Scanner;

public class Remove_X_Recursion 
{
    public static String remove_x_Recursion(String input)
    {
        if(input.length() == 0)
        {
            return input;
        }
        String ans = "";
        if(input.charAt(0) != 'x')
        {
            ans = ans + input.charAt(0);
        }

        String smallAns = remove_x_Recursion(input.substring(1));

        return ans + smallAns;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value");
        String input = sc.nextLine();
        String ans = remove_x_Recursion(input);
        System.out.println(ans);
        sc.close();
    }
}
