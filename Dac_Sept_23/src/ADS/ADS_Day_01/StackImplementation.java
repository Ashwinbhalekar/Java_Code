package ADS.ADS_Day_01;
class MyStack{
    final int SIZE = 3;
    int arr[] = new int[SIZE];
    int top = -1;
    public boolean isEmpty(){
       if(top==-1)
           return true;
       else
           return false;
    }
    public boolean isFull(){
        if(top==2)
            return true;
        else
            return false;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full...");
            return ;
        }else{
            ++top;
            arr[top] = value;
        }
    }
    public void pop(int value){
        if(isEmpty()){
            System.out.println("Stack is empty... ");
            return;
        }else{
            top--;
            System.out.println(value+" is poped");
        }
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        System.out.println("10 is pushed...");
        stack.push(20);
        System.out.println("20 is pushed...");
        stack.push(30);
        System.out.println("30 is pushed...");
        //stack.push(40);
        stack.pop(20);
        stack.pop(10);
        stack.pop(30);
        
      stack.pop(40);
//           System.out.println("40 is pushed...");
    }
}
