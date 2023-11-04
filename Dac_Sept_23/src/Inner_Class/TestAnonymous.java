package Inner_Class;
class ParentofAnonymous{
    void greeting(){
        System.out.println("Say hello...");
    }
}
class OuterofAnonymous{
    ParentofAnonymous p = new ParentofAnonymous(){
        @Override
        void greeting(){
            System.out.println("Say Namste...");
        }
    };
}
public class TestAnonymous {
    public static void main(String[] args) {
        OuterofAnonymous o = new OuterofAnonymous();
        o.p.greeting();
    }
}
