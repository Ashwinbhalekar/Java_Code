/*Q1. Write a Java program that declares an array of integers and tries to access an
element at an index beyond the array’s length. Handle the
ArrayIndexOutOfBoundsException by providing a meaningful message.*/
package Exception;
class ArrayException{
    int arr[] = {1,2,3,4};
    void show(){
        try{
        arr[6] = 6;
        System.out.println(arr);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
public class LabTask_1 {
    public static void main(String[] args) {
        ArrayException a = new ArrayException();
        a.show();
    }
}
