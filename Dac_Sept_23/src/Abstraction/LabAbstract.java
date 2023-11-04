/*Write a Java program to create an abstract class Person with abstract methods
eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the
Person class and implement the respective methods to describe how each
person eats and exercises.*/
package Abstraction;
abstract class Person{
    abstract void eat();
    abstract void exercise();
}
class Athelete extends Person{
    @Override
    void eat(){
        System.out.println("Eats Healthy Food");
    }
    @Override
    void exercise(){
        System.out.println("Exercise daily");
    }
}
class LazyPerson extends Person{
    @Override
    void eat(){
        System.out.println("Eats Junk Food");
    }
    @Override
    void exercise(){
        System.out.println("Never Do Exercise");
    }
}

public class LabAbstract {
    public static void main(String[] args) {
       Person p;
        System.out.println("Athelete Person");
        p=new Athelete();
        p.eat();
        p.exercise();
        System.out.println("********************************************");
        System.out.println("Lazyperson");
        p=new LazyPerson();
        p.eat();
        p.exercise();
        
    }
}
