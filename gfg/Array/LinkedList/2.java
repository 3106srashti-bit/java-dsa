package gfg.Array.LinkedList;

public class 2 {
    /*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/
class Solution {
    public Node deleteHead(Node head) {
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }
}


/*class Solution {
    public Node deleteHead(Node head) {
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        return head;
    }
}*/
}
