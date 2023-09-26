package Lecture_2_OOPS_2.Protected_and_Super_Keywords.vehicle;

public class Vehicle 
{
    protected String color;
    private int maxSpeed;

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
