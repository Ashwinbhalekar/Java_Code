package Abstraction;
import java.util.Scanner;
abstract class Livingthing{
    void eyes(){
        System.out.println("Two Eyes");
    }
    void mouth(){
        System.out.println("One Mouth");
    }
    abstract void legs();
}

class Human extends Livingthing{
    @Override
    void legs(){
        System.out.println("Humans have Two Legs");
    }
}

class Animals extends Livingthing{
    @Override
    void legs(){
            System.out.println("Animals having Four Legs");
    }
}
public class TestAbstraction {
    static void showProperty(Livingthing t) {
        t.eyes();
        t.mouth();
        t.legs();
    }
    
    public static void main(String[] args) {
        System.out.println("Choose which property do you want to see..");
          Scanner sc = new Scanner(System.in);
          String choice = sc.next();
           if (choice.equals("Human")) {
            System.out.println("Property of Human");
            showProperty(new Human());
        } else {
            System.out.println("Property of Animal");
            showProperty(new Animals());
        }
//        Livingthing lt;
//        System.out.println("Properties of Humans");
//        lt = new Human();
//        lt.eyes();
//        lt.mouth();
//        lt.legs();
//        System.out.println("***********************************************");
//        System.out.println("Properties of Animals");
//        lt = new Animals();
//        lt.eyes();
//        lt.mouth();
//        lt.legs();
    }
}
