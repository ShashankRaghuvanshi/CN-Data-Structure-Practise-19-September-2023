package Assignment_Recursion_1;

import java.util.Scanner;

public class String_to_Integer 
{
    public static int string_to_Integer(String input)
    {
        if(input.length() == 1)
        {
            return input.charAt(0) - '0';       //example int k = '1' - '0'; means k = 49 - 48 -> k=1
        }
        
        int smallOutput = string_to_Integer(input.substring(0, input.length()-1));

        int lastDigit = input.charAt(input.length()-1) - '0';
        return smallOutput*10 + lastDigit;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String numeric value");
        String input = sc.nextLine();

        int ans = string_to_Integer(input);
        System.out.println(ans);

        sc.close();

    }
}
