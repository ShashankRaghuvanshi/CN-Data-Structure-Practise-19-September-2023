package Lecture_2_OOPS_2.Polymorphism;

public class Vehicle 
{
    protected String color;
    private int maxSpeed;

    public Vehicle(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor");
    }

    public void setMaxSpeed(int maxSpeed) 
    {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() 
    {
        return maxSpeed;
    }

    public void print()
    {
        System.out.println("Vehicle color: "+ color);
        System.out.println("Vehicle maxSpeed: "+ maxSpeed);
    }
}
