package Inheritance.multilevel;
class value1{
    int a=10;
    void show(){
        System.out.println("Value of a="+a);
    }
}
class value2 extends value1{
    int b=20;
    void display(){
        System.out.println("Value of b="+b);
    }
}
class Add extends value2{
    int c;
    void add(){
        c=a+b;
        System.out.println("Addition is="+c);
    }
}
public class TestMultilevelInheritance {
    public static void main(String[] args) {
        Add a = new Add();
        a.show();
        a.display();
        a.add();
    }
    
}
