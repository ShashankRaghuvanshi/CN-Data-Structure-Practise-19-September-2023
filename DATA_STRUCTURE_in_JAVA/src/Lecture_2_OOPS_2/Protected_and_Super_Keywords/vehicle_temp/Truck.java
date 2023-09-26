package Lecture_2_OOPS_2.Protected_and_Super_Keywords.vehicle_temp;

import Lecture_2_OOPS_2.Component_Of_OOPS.Vehicle;

public class Truck extends Vehicle
{
    int maxLoadingCapacity;

    public void print()
    {
        System.out.println("Truck capacity: "+ maxLoadingCapacity);
        System.out.println("Truck color: "+ color);
        System.out.println("Truck max speed: "+ getMaxSpeed());
    }
}
