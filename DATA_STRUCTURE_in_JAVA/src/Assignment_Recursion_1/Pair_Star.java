package Assignment_Recursion_1;

import java.util.Scanner;

public class Pair_Star 
{
    public static String pair_Star(String input)
    {
        String output;
        if(input.length() == 1)
        {
            return input;
        }
        String smallString = pair_Star(input.substring(1));

        if(input.charAt(0) == smallString.charAt(0))
        {
            output = input.charAt(0) + "*" + smallString;
        }
        else
        {
            output = input.charAt(0) + smallString;
        }
        return output;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value");
        String input = sc.nextLine();
        String ans = pair_Star(input);
        System.out.println(ans);
        sc.close();
    }
}
