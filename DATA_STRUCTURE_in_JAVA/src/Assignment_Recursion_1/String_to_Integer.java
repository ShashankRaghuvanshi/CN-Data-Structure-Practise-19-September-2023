package Assignment_Recursion_1;

import java.util.Scanner;

public class String_to_Integer 
{
    public static int string_to_Integer(String input)
    {
        if(input.length() == 0)
        {
            return 0;
        }
        int smallOutput = string_to_Integer(input.substring(1,input.length()-1)) ;
        return smallOutput * 10 + input.charAt(input.length()-1);
        
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
