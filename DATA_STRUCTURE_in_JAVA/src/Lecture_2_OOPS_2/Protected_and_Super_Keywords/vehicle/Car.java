package Lecture_2_OOPS_2.Protected_and_Super_Keywords.vehicle;

public class Car extends Vehicle
{
    int numGears;
    boolean isConvertible;

    public void print()  //printCar() renamed to print()
    {
        super.print();                                         //super keyword
        System.out.println("Car numGears: "+ numGears);
        System.out.println("Car isConvertible: "+ isConvertible);
    }

}

//Vehicle-  parent, super, base class
//Car- child, subclass, derived class