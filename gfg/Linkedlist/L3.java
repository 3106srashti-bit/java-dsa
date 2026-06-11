package Linkedlist;

public class L3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    
    public Node deleteHead(Node head) {
       
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }
}
}
