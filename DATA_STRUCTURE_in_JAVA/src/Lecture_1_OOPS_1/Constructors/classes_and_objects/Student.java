package Lecture_1_OOPS_1.Constructors.classes_and_objects;

public class Student 
{
    String name;
    private int rollNumber;

    //default constructor
    public Student()  
    {

    }

    //customized constructor
    public Student(String name, int rollNumber)  
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // public Student()
    // {
    //     rollNumber = 100;
    // }

    public Student(String name)
    {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) 
    {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() 
    {
        return rollNumber;
    }

    public void print()
    {
        System.out.println(name+" "+rollNumber);
    }


}
