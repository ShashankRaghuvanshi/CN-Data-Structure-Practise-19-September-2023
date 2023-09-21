package Lecture_1_OOPS_1.Important_Keywords.classes_and_objects;

public class Student 
{
    String name;
    private int rollNumber;
    
    private static int numStudent;    
    //static we access with the help of Class name
    //static function do not depend on object ----important
    
    //final data members can be initialized as soon as they are declared, or inside constructor final only
    // private final int rollNumber = 100;    
    

    //customized constructor
    public Student(String name, int rn)  
    {
        this.name = name;
        rollNumber = rn;
        numStudent++;
    }

    public static int getNumStudent() {
        return numStudent;
    }

    public static void setNumStudent(int numStudent) {
        Student.numStudent = numStudent;
    }

    //access data member which has same name as a local variable
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
