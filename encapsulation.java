import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Vechile{
    private String brand;
    private int speed;

    //setter for brand
    public void setBrand(String brand){
        this.brand = brand;
    }

    //setter for speed
    public void setSpeed(int speed){
        if(speed<0){
            System.out.println("Speed cannot be negative!");
            this.speed = 0;
        }else{
            this.speed = speed;
        }
    }

    //getter for brand
    public String getBrand(){
        return brand;
    }

    //getter for speed
    public int getSpeed(){
        return speed;
    }
}

public class encapsulation{
    public static void main(String[] args){
        Vechile v = new Vechile();
        v.setBrand("Toyota");
        v.setSpeed(80);
        System.out.println("Vechile Brand: "+v.getBrand());
        System.out.println("Vechile Speed: "+v.getSpeed());
    }
}
