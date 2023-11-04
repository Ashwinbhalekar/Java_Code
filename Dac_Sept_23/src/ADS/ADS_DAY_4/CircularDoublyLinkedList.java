package ADS.ADS_DAY_4;

class Node {

    Node prev;
    int data;
    Node next;
}

public class CircularDoublyLinkedList {

    Node head = null, last = null;

    void addFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (head == null) {
            newNode.prev = last;
            newNode.next = head;
            head = newNode;
            last = newNode;
        } else {
            newNode.next = head;
            newNode.prev = last;
            head.prev = newNode;
            last.next = newNode;
            head = newNode;
        }
    }

    void showCircular() {
        System.out.println("Forward Movement...");
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
            
        } while (temp != head);
//        System.out.println("Backword movement...!");
//        while(last!=null){
//            System.out.println(last.data);
//            last=last.prev;
//        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.addFirst(100);
        cdll.addFirst(200);
        cdll.addFirst(300);
        cdll.showCircular();
  
    }
}
