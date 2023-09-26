package Lecture_2_OOPS_2.Protected_and_Super_Keywords.vehicle;

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
        c.print();      
        
    }
}
