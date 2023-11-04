package generic;

import java.util.List;

public class GenericMethods {
//    public static void showData(String arr[]){
//        for(String s:arr)
//            System.out.println(s);
//    }
//    public static void showData(Integer arr[]){
//        for(Integer i:arr)
//            System.out.println(i);
//    }
//    public static <A>void showData(A arr[]){        //Generic method for using all datatype
//        for(A a:arr)
//            System.out.println(a);
//    } 

//    public static void showData(List<? extends Number> lst) {        //Upper bound (Wild Card)
//        for (Number s : lst) {
//            System.out.println(s);
//        }
//    }
    public static void showData(List<? super Integer> lst){        //Lower bound (Wild Card)
        for(Object s:lst)                                          //we can not use float, double data values
            System.out.println(s);
    }     

    public static void main(String[] args) {
//        String names[]={"AShwin","Saurabh"};
//        showData(names);
        List<Number> lst = List.of(23.48, 24.5, 25);
        showData(lst);
    }
}
