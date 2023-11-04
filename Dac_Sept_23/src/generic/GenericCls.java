package generic;
class Container<T>{                                 //Making class generic for avoiding type casting and passing all datatypes.
//    Object contain;                                     //Using object for pass the all datatype.
//
//    public Container(Object contain) {
//        this.contain = contain;
//    }
//
//    public Object getContain() {
//        return contain;
//    }
//    public void showType(){
//        System.out.println(contain.getClass().getName());
//    }
   T contain;                                     

    public Container(T contain) {
        this.contain = contain;
    }

    public T getContain() {
        return contain;
    }
    public void showType(){
        System.out.println(contain.getClass().getName());
    }    
}
public class GenericCls {
    public static void main(String[] args) {
        Container<String> c = new Container<>("CDAC");
        String s = c.getContain();                 
        System.out.println(c.getContain());
        c.showType();
    }
}
