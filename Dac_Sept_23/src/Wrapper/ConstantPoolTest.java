package Wrapper;

public class ConstantPoolTest {
    public static void main(String[] args) {
        //For Integer Family -128 to 127
       // Byte b1 = Byte.valueOf("50");
       // Byte b2 = Byte.valueOf("50");
        
        
//        Short b1 = Short.valueOf("127");
//        Short b2 = Short.valueOf("127");       
    

//        Boolean b1 = Boolean.valueOf("false");
//        Boolean b2 = Boolean.valueOf("true");   

//        Float b1 = Float.valueOf("12.23");
//         Float b2 = Float.valueOf("12.23");

//      Range for character for constant pool '\u0000' to '\u0007'
         System.out.println('\u006d');
        Character b1 = Character.valueOf('A');
        Character b2 = Character.valueOf('A');
        System.out.println(b1==b2);
    }
}
