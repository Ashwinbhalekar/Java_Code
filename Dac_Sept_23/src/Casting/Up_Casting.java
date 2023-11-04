package Casting;

class parent{
    //String name;
    void method(){
        System.out.println("Parent class method");
    }
}
class child extends parent{
   // int= id;
    @Override
    void method(){
        super.method();
        System.out.println("Child class method");
    }
}

public class Up_Casting{
        public static void main(String[] args){
            
            double d=12.23;
            int a=(int)d;
            
            parent p= (parent)new child();
       // parent p=new child();
        child c= (child)p;
        c.method();
        
    }
    
}