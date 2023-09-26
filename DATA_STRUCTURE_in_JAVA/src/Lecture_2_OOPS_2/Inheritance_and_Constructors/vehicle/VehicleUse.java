package Lecture_2_OOPS_2.Inheritance_and_Constructors.vehicle;

public class VehicleUse 
{
    public static void main(String[] args) 
    {
        Vehicle v = new Vehicle(60);
        v.color = "Red";
        //v.print();

        Car c = new Car(10, 60);
        c.color = "Black";
        c.setMaxSpeed(100);
        //c.print();      
        
    }
}
