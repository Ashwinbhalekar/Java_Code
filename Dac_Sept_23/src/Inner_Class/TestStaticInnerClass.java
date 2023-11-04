package Inner_Class;
class Outer{
    int x=10;
    static class InnerStatic{
        int y=20;
        void show(){
            Outer o = new Outer();
            System.out.println("I'm From Static Inner Class "+ o.x+ "\n" + y);
        }
    }
}
public class TestStaticInnerClass {
    public static void main(String[] args) {
        Outer.InnerStatic o = new Outer.InnerStatic();
        o.show();
    }
    
}
