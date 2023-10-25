package Lecture_4_Recursion_2.Print_Keypad_Combinations;

import java.util.Scanner;

public class Print_Keypad_Combinations 
{
    public static char[] singleDigit(int n)
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

    public static void print_Keypad_Combinations(int n, String outputSoFar)
    {
        if(n == 0)
        {
            System.out.println(outputSoFar);
            return;
        }

        char singleDigitOutput[] = singleDigit(n % 10);
        for(int i = 0; i < singleDigitOutput.length; i++)
        {
            print_Keypad_Combinations(n /10, singleDigitOutput[i] + outputSoFar);
        }
    }

    public static void print_Keypad_Combinations(int n)
    {
        print_Keypad_Combinations(n, "");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        print_Keypad_Combinations(n);
    }
}
