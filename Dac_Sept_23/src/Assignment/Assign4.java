/*4.Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Rectangle that extend the GeometricShape
class and implement the respective methods to calculate the area and perimeter of each shape. */
package Assignment;
abstract class GeometricShape{
    abstract double area();
    abstract int perimeter();
}
class Triangle extends GeometricShape{
    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;
    public Triangle( int base, int height, int side1,int side2,int side3){
       this.base = base;
       this.height = height;
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
    }
    @Override
    double area(){
        return 0.5 * base * height;
    }
    @Override
    int perimeter(){
        return side1 + side2 + side3;
    }
}
class Rectangle extends GeometricShape{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        return length * width;
    }
    @Override
    int perimeter(){
        return 2*(length + width);
    }
}
public class Assign4 {
    public static void main(String[] args) {
        Triangle t = new Triangle(5,10,5,5,5);
        Rectangle r = new Rectangle(10,20);
        System.out.println("Area of Triagnle: "+t.area()); 
        System.out.println("Perimeter of Triangle: "+t.perimeter());
        System.out.println("****************************************************");
        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Perimeter of Rectangle: "+r.perimeter());
    }
}
