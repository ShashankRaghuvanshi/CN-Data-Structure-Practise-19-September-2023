package Lecture_1_OOPS_1.Intro_TO_OOPS.classes_and_objects;

import java.util.Scanner;

public class StudentUse 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "Ankush";
        s1.rollNumber = 123;

        Student s2 = new Student();
        System.out.println(s1);
        s2.name = "Manisha";
        s2.rollNumber = 130;

        System.out.println(s1.name);
        System.out.println(s2.name);


        sc.close();

    }
}
