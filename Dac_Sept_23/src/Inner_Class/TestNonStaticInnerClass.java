package Inner_Class;
class Outer{
    int x = 100;
    class Inner{
        int y = 200;
        void display(){
            System.out.println("I'm in Non-Stattic inner class"+(y+x));
        }
    }
}
public class TestNonStaticInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner obj = o.new Inner();
        obj.display();
    }
    
}
