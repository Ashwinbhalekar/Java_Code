package Abstraction;

public class StudentImpl implements StudentInterface {
    @Override
    public void showName(String name){
        System.out.println("My name is "+name);
    }
     @Override
    public void showAge(int age){
        System.out.println("My age is "+age);
    }
}
