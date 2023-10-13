package Lecture_4_Recursion_2;

import java.util.Scanner;

public class Replace_Character_Recursively 
{
    public static String replace_Character_Recursively(String input, Character ch1, Character ch2)
    {
        if(input.length() == 0)
        {
            return "";
        }
        if(input.charAt(0) == ch1)
        {
            return ch2 + replace_Character_Recursively(input.substring(1), ch1, ch2);
        }
        return input.charAt(0) + replace_Character_Recursively(input.substring(1), ch1, ch2);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String input = sc.nextLine();

        System.out.println("Enter the character need to be replaced ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter the character replaced by");
        char ch2 = sc.next().charAt(0);

        String ans = replace_Character_Recursively(input,ch1, ch2);
        System.out.println(ans);

        sc.close();
    }
}
