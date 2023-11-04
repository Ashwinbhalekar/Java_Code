package Exception;

public class ExceptionDemo1 {
    int a = 10;
    int b = 0;
    void show(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        try{
        System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
        System.out.println("D");
        System.out.println("E");
        }
    }
    public static void main(String[] args) {
        ExceptionDemo1 e = new ExceptionDemo1();
        e.show();
    }
    
}
