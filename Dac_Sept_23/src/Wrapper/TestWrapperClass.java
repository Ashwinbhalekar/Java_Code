package Wrapper;

public class TestWrapperClass {
    public static void main(String[] args) {
        int x = 10;
        
        //Before JDK5
        
        /*Integer i = new Integer(x);   //Converting primitve type data to refrence type data(BOXING)
        int a = i.intValue();              //Converting Refrence type data to primitive type data(UNBOXING)*/
        
        //After JDK5
        
        Integer i = x;                //AUTOBOXING
        int a = x;                    //AUTOUNBOXING
        System.out.println("Primitive Type Data: "+x);
        System.out.println("Refrence type Data: "+i);
        
        String age = "25.5";
        //System.out.println(age+5);          //It concat the data and gives 255 as output which we dont want
        //int age1 = Integer.parseInt(age);  //convert string to corresponding numeric value 
       // System.out.println(age1+5);
        
        
       float age1 = Float.parseFloat(age);
       System.out.println(age1+5);
       
       
       double age2 = Double.parseDouble(age);
       System.out.println(age2+5);
    }          
}
