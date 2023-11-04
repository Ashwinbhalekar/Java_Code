
package Exception;
   /*class TestThrowsDemo{
        int a = 10;
        int b = 0;
        
        void show() throws Exception{
            System.out.println(a/b);
            System.out.println("A");
        }
        void display(){
            System.out.println("Display");
        }
        void test(){
            System.out.println("Test");
            display();
        }
    }*/

public class ExceptionDemo2 {
    public static  class TestThrowsDemo{
        int a = 10;
        int b = 0;
        
        void show() throws Exception{
            System.out.println(a/b);
            System.out.println("A");
        }
        void display(){
            System.out.println("Display");
        }
        void test(){
            System.out.println("Test");
            display();
        }
    }
    public static void main(String[] args) {
       TestThrowsDemo t = new TestThrowsDemo();
       try{
       t.show();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       t.display();
    }
}
