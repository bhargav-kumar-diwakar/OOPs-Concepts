import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Vechile{
    void fuelType(){
        System.out.println("Vechile uses petrol as fuel.");
    }
}

class car extends Vechile{
    void seatingCapacity(){
        System.out.println("Car has a seating capacity of 5 people.")
    }
}

public class inheritance{
    public static void main(String[] args){
        Car c = new Car();
        c.fuelType();
        c.seatingCapacity();
    }
}
