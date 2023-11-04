/*Q5.Write a Java program to demonstrate Upcasting Vs Downcasting */
package Assignment;
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }

    public void playFetch() {
        System.out.println("Playing fetch");
    }
}

public class Assign5 {
    public static void main(String[] args) {
        // Upcasting
        Dog dog = new Dog();
        Animal a = dog; // Upcasting

        a.makeSound(); // Calls the overridden method in Dog

        // Downcasting
        if (a instanceof Dog) {
            Dog newDog = (Dog) a; // Downcasting
            newDog.makeSound(); // Calls the overridden method in Dog
            newDog.playFetch(); // Accesses the method specific to Dog class
        }
    }
}