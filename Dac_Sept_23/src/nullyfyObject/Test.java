package nullyfyObject;

public class Test {
    protected void finalize(){
        System.out.println("Object destroied");
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1 = null;
        System.gc();
    }
}
