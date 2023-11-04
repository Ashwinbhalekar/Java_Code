package objectInsideMethod;

public class Test {
    private static void display(){
        Test t2 = new Test("t2 ");
    }
    String objName;
    public Test(String objName){
    this.objName = objName;
    }
     static void show(){
        Test t1 = new Test("t1 ");
        display();
    } 
     
     @Override
     protected void finalize(){
         System.out.println(this.objName+"is free from memory");
     }
     public static void main(String[] args) {
        show();
        System.gc();
        
    }
}
   

