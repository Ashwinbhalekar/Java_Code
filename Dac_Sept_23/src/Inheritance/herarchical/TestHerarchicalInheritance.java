package Inheritance.herarchical;
class value{
    int a=10;
    int b=20;
    void show(){
        System.out.println("Value of a= " + a + "\nValue of b= "+b);
    }
}
class Add extends value{
    int c;
    void add(){
        c=a+b;
        System.out.println("Addition is=" +c);
    }
}
class Sub extends value{
    int c;
    void sub(){
        c=a-b;
        System.out.println("Substraction is= "+c);
    }
}
class Mult extends value{
    int c;
    void mult(){
        c=a*b;
        System.out.println("Multiplication is= "+c);
    }
}
public class TestHerarchicalInheritance {
    public static void main(String[] args) {
        Add a=new Add();
        a.show();
        a.add();
        Sub s = new Sub();
        s.show();
        s.sub();
        Mult m = new Mult();
        m.show();
        m.mult();
        
    }
}
