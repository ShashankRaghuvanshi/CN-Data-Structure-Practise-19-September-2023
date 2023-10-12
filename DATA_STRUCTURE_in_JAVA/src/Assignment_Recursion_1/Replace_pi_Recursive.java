package Assignment_Recursion_1;

import java.util.Scanner;

public class Replace_pi_Recursive 
{
    public static String replacePi(String input)
    {
        String output;
        if(input.length() <= 1)
        {
            return input;
        }

        String smallString = replacePi(input.substring(1));

        if(input.charAt(0) == 'p' && smallString.charAt(0) == 'i')
        {
            output = "3.14" + smallString.substring(1);
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
        String str = sc.nextLine();
        String ans = replacePi(str);
        System.out.println(ans);
        sc.close();
    }
}
