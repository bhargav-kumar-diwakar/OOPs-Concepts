import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Vechile{
    void start(){
        System.out.println("Vechile Started.");
    }
}

class Bike extends Vechile{
    void start(){
        System.out.println("Bike starts with self or kick.");
    }
}


public class polymorphism{
    public static void main(String[] args){
        Vechile v = new Bike(); // Upcasting
        v.start(); // calls's bike start()
    }
}