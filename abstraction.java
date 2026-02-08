import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

abstract class Vechile{

    //Absstract method
    abstract void start();

    //Normal method
    void fuelType(){
        System.out.println("This vechile runs on petrol!");
    }
}

class car extends Vechile{

    //Implementing Abstract method
    void start(){
        System.out.println("Car starts with a key.");
    }
}
