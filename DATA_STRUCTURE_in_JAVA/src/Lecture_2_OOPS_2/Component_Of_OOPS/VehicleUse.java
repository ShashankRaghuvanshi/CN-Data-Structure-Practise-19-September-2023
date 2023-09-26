package Lecture_2_OOPS_2.Component_Of_OOPS;

public class VehicleUse 
{
    public static void main(String[] args) 
    {
        Vehicle v = new Vehicle();
        v.print();

        Car c = new Car();
        c.numGears = 10;
        c.color = "Black";
        c.print();
    }
}
