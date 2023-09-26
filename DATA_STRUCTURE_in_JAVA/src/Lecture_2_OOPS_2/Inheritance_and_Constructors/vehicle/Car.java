package Lecture_2_OOPS_2.Inheritance_and_Constructors.vehicle;

public class Car extends Vehicle
{
    int numGears;
    boolean isConvertible;

    public Car(int numGears, int maxSpeed)
    {
        //when super class default constructor is not there then call super function, if there is default constructor in parent then we don not have to call implicitly with super fucntion
        //super(100);    
        super(maxSpeed);               //this should be first when we call parent construtor
        this.numGears = numGears;
        System.out.println("Car Constructor");
    }
    //Note Important
    //when we call/create derived/child class object, then it will also call parent/super class object constructor as well
    //i.e. it will call Car() construtor plus Vehicle() constructor 

    public void print()  
    {
        super.print();               //we can access parent data member and function we can access super()                    
        System.out.println("Car numGears: "+ numGears);
        System.out.println("Car isConvertible: "+ isConvertible);
    }

}
