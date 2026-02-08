import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

abstract class Vechile{

    //Absstract method
    abstract void start();

    //Normal method
    void fuelType(){
        System.out.println("This vechile runs on petrol.");
    }
}

class Car extends Vechile{

    //Implementing Abstract method
    void start(){
        System.out.println("Car starts with a key.");
    }
}

public class abstraction{
    public static void main(String[] args){
        Car c = new Car();
        c.start(); // calling abstract method implementation
        c.fuelType(); // calling normal method
    }
}
