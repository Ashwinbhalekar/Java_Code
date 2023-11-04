package Inheritance.single;
class Single{
   int a=10;
   int b=20;
   void show(){
       System.out.println("Value of a="+a+"\nValue of b="+b);
   }
}
class Add extends Single{
    int c;
    void add(){
        c=a+b;
        System.out.println("Addition is="+c);
    }
}
public class TestSingleInheritance {
    public static void main(String[] args) {
        Add a = new Add();
        a.show();
        a.add();
    }
}
