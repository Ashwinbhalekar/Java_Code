package Abstraction;
public class TestInterface {
    public static void main(String[] args) {
        StudentInterface si;
        si = new StudentImpl();
        si.showAge(25);
        si.showName("Bablu");
        si.course();
        StudentInterface.institute();
    }
}
