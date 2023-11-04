package ADS.ADS_DAY_4;
class Node{
    Node prev;
    int data;

    public Node() {
    }
    Node next;
}
public class DoublyLinkedList {
    Node head = null;
    
    void addFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(head==null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        }else{
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(head==null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=null;
        }       
    }
    void delet(int val){
        if(head==null)
            return;
        Node temp = head;
        while(temp!=null && temp.data!=val){
            temp=temp.next;
        }
        if(temp==null)
            System.out.println("Data not found");
        else if(temp == head){
            head=head.next;
            head.prev=null;
        }else if(temp.next == null){
            temp.next = null;
        }else{
            temp.prev = temp.next;
            temp.next = temp.prev;
           
        }
    }
    boolean search(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data==val)
                return true;
            temp=temp.next;
        }
        return false;
    }
    void printDoublyLinkedList(){
        System.out.println("Froward movement...!");
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next == null){
                last=temp;
            }
            temp=temp.next;
        }
        System.out.println("Backword movement...!");
        while(last!=null){
            System.out.println(last.data);
            last=last.prev;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(100);
        dll.addFirst(200);
        dll.addFirst(300);
        
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        
        
        dll.printDoublyLinkedList();
       
    }
}
