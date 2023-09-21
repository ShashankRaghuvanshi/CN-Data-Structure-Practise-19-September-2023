package Lecture_1_OOPS_1.Constructors.classes_and_objects;

import java.util.Scanner;

public class StudentUse 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        Student s3 = new Student("Shashank",144);
        // System.out.println(s3.name+" "+ s3.getRollNumber());
        s3.print();

        // System.out.println(s1.name+" "+s1.getRollNumber());
        s1.print();

        //by default of object all the properties are initialized from zero or null always

        s1.name = "Ankush";
        s1.setRollNumber(123);
        s1.print();

        Student s2 = new Student();
        s2.name = "Manisha";
        s2.setRollNumber(130);
        s2.print();

        // System.out.println(s1.name+" "+s1.getRollNumber());
        // System.out.println(s2.name+" "+s2.getRollNumber());

        Student s4 = new Student("Shivam");
        s4.print();

        sc.close();

    }
}
