package Abstraction;
public interface StudentInterface {
    int a=10;
    void showName(String name);
    void showAge(int age);
    
    default void course(){
        System.out.println("Default Method of interface");
        System.out.println("Private non-static method"+exam());
    }
    static void institute(){
        System.out.println("This static method of interface "+city());
    }
    private String exam(){
    return "CET";
    }
    private static String city(){
        return "Nagpur";
    }
}
