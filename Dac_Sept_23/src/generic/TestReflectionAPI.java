package generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private void showInfo(){
        System.out.println("Hi Mr. "+name+" your age is "+age);
    }
}
public class TestReflectionAPI {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        
        //Create class reference
        Class personCls = Person.class;
        Constructor cons = personCls.getDeclaredConstructor(String.class,int.class);
        Object object = cons.newInstance("Ashwin",27);
        
        //Accessing private field
        Field fname=personCls.getDeclaredField("name");
        fname.setAccessible(true);
        fname.set(object, "Suresh");
        
        //Accessing private method
        Method m=personCls.getDeclaredMethod("showInfo");
        m.setAccessible(true);
        m.invoke(object);
        
        String s=(String)fname.get(object);
        System.out.println(s);
        
        Field fage=personCls.getDeclaredField("age");
        fage.setAccessible(true);
        int ag=fage.getInt(object);
        System.out.println(ag);
    }
}
