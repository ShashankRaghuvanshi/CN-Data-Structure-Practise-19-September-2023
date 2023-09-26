package Lecture_2_OOPS_2.Inheritance_and_Private_members;

public class VehicleUse 
{
    public static void main(String[] args) 
    {
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.setMaxSpeed(10);
        v.print();

        Car c = new Car();
        c.numGears = 10;
        c.color = "Black";
        c.setMaxSpeed(100);
        c.print();      //car print() function overide the print() of vehicle
        
    }
}
