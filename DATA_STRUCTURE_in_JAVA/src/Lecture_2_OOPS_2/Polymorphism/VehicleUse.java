package Lecture_2_OOPS_2.Polymorphism;

public class VehicleUse 
{
    public static void main(String[] args) 
    {
        Vehicle v = new Car(10, 90);  
        //parent reference can point to any sub class

        //boolean ans = v.isConvertible();
        //we can do vehicle specific things only important

        v.print();
        
    }
}
