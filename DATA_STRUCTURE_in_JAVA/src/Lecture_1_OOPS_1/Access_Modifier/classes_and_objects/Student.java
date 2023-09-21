package Lecture_1_OOPS_1.Access_Modifier.classes_and_objects;

public class Student 
{
    public String name;

    private int rollNumber;

    public void setRollNumber(int rn)
    {
        if(rn <= 0)
        {
            return;
        }
        rollNumber = rn;
    }

    public int getRollNumber()
    {
       return rollNumber;
    }
}


//default
//private
//public
//protected --after inheritance we will understand
