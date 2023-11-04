/*3.Write a Java program to create an abstract class Instrument with abstract methods play() and
tune(). Create subclasses for Piano and Guitar that extend the Instrument class and implement
the respective methods to play and tune each instrument.*/
package Assignment;
abstract class Instrument{
    abstract void play();
    abstract void tune();
}
class Piano extends Instrument{
    @Override
    void play(){
        System.out.println("I'm can play Piano");
    }
    @Override
    void tune(){
        System.out.println("I don't know how to tune piano");  
    }
}
class Guitar extends Instrument{
    @Override
    void play(){
        System.out.println("I love to play guitar");
    }
    @Override
    void tune(){
        System.out.println("Every person cann't tune the guitar");
    }
}
public class Assign3 {
    public static void main(String[] args) {
        Instrument In;
       In = new Piano();
        In.play();
        In.tune();
        System.out.println("***********************************************");
        In = new Guitar();
        In.play();
        In.tune();
    }
    
}
