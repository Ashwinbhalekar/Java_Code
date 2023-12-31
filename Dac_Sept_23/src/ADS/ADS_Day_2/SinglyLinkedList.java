package ADS.ADS_Day_2;
class Node{
    int data;
    Node next;
}
public class SinglyLinkedList {
    Node head;
    
    void addFirst(int val){
       Node newNode = new Node();
       newNode.data = val;
       newNode.next = head;
       
       head = newNode;     //Shifting of head to newNode
    }
    void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;
        
        if(head==null){
            head = newNode;
        }else{
            Node lastNode = head;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
    void deleteNode(int val){
        if(head.data==val){
            head=head.next;
        }else{
            Node temp=head;
            while(temp.next!=null){
                if(temp.next.data==val){
                    temp.next=temp.next.next;
                    break;
                }
                temp=temp.next;
            }
        }
    }
    boolean searchNode(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data==val)
                return true;
            temp=temp.next;
        }
    
        return false;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addFirst(10);
        sl.addFirst(20);
        sl.addFirst(30);
        sl.addFirst(40);
        sl.addFirst(50);
        
        sl.addLast(100);
//        sl.deleteNode(50);
//        sl.printList();
        System.out.println(sl.searchNode(30));
    }
}
