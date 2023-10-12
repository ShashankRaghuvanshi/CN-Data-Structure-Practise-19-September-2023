package Assignment_Recursion_1;

import java.util.Scanner;

public class Remove_X 
{
    public static String remove_X(String input)
    {
        String output;
        if(input.length() == 0)
        {
            return input;
        }

        String smallAns = remove_X(input.substring(1));

        if(input.charAt(0) == 'x')
        {
            output = smallAns.substring(0);
        }
        else
        {
            output = input.charAt(0) + smallAns.substring(0);
        }
        return output;
    }

    public static String remove_X_better(String input)
    {
        if(input.length() == 0)
        {
            return "";
        }
        if(input.charAt(0) == 'x')
        {
            return remove_X_better(input.substring(1));
        }
        return input.charAt(0) + remove_X_better(input.substring(1));
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value");
        String str = sc.nextLine();

        String ans = remove_X(str);
        System.out.println(ans);

        String ans2 = remove_X_better(str);
        System.out.println(ans2);
        sc.close();
    }
}
