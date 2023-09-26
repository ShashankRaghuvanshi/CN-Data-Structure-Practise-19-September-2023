package Lecture_2_OOPS_2.Inheritance_and_Private_members;

public class Car extends Vehicle
{
    int numGears;
    boolean isConvertible;

    public void print()  //printCar() renamed to print()
    {
        System.out.println("Car color: "+ color);
        System.out.println("Car Speed: "+ getMaxSpeed());
        System.out.println("Car numGears: "+ numGears);
        System.out.println("Car isConvertible: "+ isConvertible);
    }

}
