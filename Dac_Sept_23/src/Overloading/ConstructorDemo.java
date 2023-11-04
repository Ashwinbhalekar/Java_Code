package Overloading;
class Test{
    int a=50;
//    public Test(){
//        a=10;
//    }
    public Test(int x){
        a=x;
    }
    void show(){
    System.out.println(a);
    }
}
public class ConstructorDemo {
     public static void main(String[] args) {
//        Test t = new Test();
        Test t1 = new Test(500);
         System.out.println(t1.a);
         t1.show();
        
    }
}
