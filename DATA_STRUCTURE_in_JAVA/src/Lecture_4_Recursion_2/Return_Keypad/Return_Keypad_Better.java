package Lecture_4_Recursion_2.Return_Keypad;

import java.util.Scanner;

public class Return_Keypad_Better 
{
    public static char[] numberOptions(int n)
    {
        switch(n)
        {
            case 2:
            {
                char options2[] = {'a','b','c'};
                return options2;
            }
            case 3:
            {
                char options3[] = {'d','e','f'};
                return options3;
            }
            case 4:
            {
                char option4[] = {'g','h','i'};
                return option4;
            }
            case 5:
            {
                char option5[] = {'j','k','l'};
                return option5;
            }
            case 6:
            {
                char option6[] = {'m','n','o'};
                return option6;
            }
            case 7:
            {
                char option7[] = {'p','q','r','s'};
                return option7;
            }case 8:
            {
                char option8[] = {'t','u','v'};
                return option8;
            }
            case 9:
            {
                char option9[] = {'w','x','y','z'};
                return option9;
            }
            default:
            {
                char options[] = {'\0'};
                return options;
            }

        }
    }

    public static String[] returnKeypad(int n)
    {
        if(n == 0)
        {
            String ans[] = {""};
            return ans;
        }

        int lastDigit = n % 10;
        int smallerNumber = n / 10;
        String smallAns[] = returnKeypad(smallerNumber);
        char options[] = numberOptions(lastDigit);
        String ans[] = new String[smallAns.length * options.length];
        int k = 0;

        for(int i=0; i < smallAns.length; i++)
        {
            for(int j=0; j < options.length; j++)
            {
                ans[k] = smallAns[i] + options[j];
                k++;
            }
        }
        return ans;
    }

    public static String[] returnKeypad2(int n)
    {
        if(n == 0)
        {
            String ans[] = {""};
            return ans;
        }

        int lastDigit = n % 10;
        int smallerNumber = n / 10;
        String smallAns[] = returnKeypad2(smallerNumber);
        char options[] = numberOptions(lastDigit);
        String ans[] = new String[smallAns.length * options.length];
        int k = 0;

        for(int j=0; j < options.length; j++)
        {
            for(int i=0; i < smallAns.length; i++)
            {
                ans[k] = smallAns[i] + options[j];
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        String[] ans = returnKeypad(num);
        for(int i=0; i <  ans.length; i++)
        {
            System.out.print(ans[i]+ " ");
        } 
        System.out.println();

        String[] ans2 = returnKeypad2(num);
        for(int i=0; i <  ans2.length; i++)
        {
            System.out.print(ans2[i]+ " ");
        } 
        System.out.println();
        sc.close();
    }
}

