/*7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous Inner class).*/
package Assignment;
class Car{
    String carName;
    static class Engine{
        String name;
        void show(){
            Car c = new Car();
            System.out.println("Name of car: "+ c.carName + name + " engine is used");
        }
    }
    class headLight{
        String comName;
        void show(){
            System.out.println(comName +" is used in " +carName);
        }
    }
    truck t = new truck(){
        @Override
        void wheel(){
            System.out.println("Best Car...");
        }
    };
}
class truck{
    void wheel(){
        System.out.println("Truck has 8 wheels");
    }
}
public class Assign7 {
    public static void main(String[] args) {
        Car.Engine c = new Car.Engine();
        c.show();
        
        Car c1 = new Car();
        c1.t.wheel();
        Car.headLight h = c1.new headLight();
        h.show();
        
    }
}
