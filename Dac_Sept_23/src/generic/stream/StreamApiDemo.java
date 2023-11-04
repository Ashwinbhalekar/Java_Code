package generic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> lst = List.of("Ashwin","Saurabh","Mihir","Manish");
        
        lst.stream().forEach(e->System.out.println(e));      //For accessing the data whithout using for each loop
        lst.stream().forEach(System.out::println);      //For accessing the data whithout using for each loop called method refrence
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***********************************"); 
        
        //Filter method
        List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenlst = lst1.stream().filter(i->i%2==0).collect(Collectors.toList());                  //Predicate return boolean value
        evenlst.stream().forEach(System.out::println);
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***********************************");
        
        //Map method
        lst1.stream().map(i->i+5).collect(Collectors.toSet()).forEach(System.out::println);
        
        //Sorting the data
        lst.stream().sorted().forEach(System.out::println);
        System.out.println("************************************");
        lst.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);  //decending order
        
        System.out.println("************************************");
        System.out.println("************************************");
        Integer i = lst1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(i);
        
        System.out.println("************************************");
        System.out.println("************************************");
        System.out.println("************************************");
        
        //use in array
        String arr[] = {"Ashwin","Saurabh","Mihir","Manish","Akshay"};
        Arrays.stream(arr).filter(e->e.startsWith("A")).forEach(System.out::println);
        
    }
}
