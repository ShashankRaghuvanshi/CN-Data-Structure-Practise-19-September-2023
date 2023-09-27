package Lecture_3_Recursion_1.Print_Numbers;

import java.util.Scanner;

public class Print_Numbers 
{
    public static void printNum(int n)
    {
        if(n == 1)
        {
            System.out.print(n+" ");
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printNum(n);
        sc.close();
    }
}
