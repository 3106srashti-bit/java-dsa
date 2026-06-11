package gfg.Array.LinkedList;

public class 4 {
   /*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
/*class Solution {   //my code
        Node pre = null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;      
            pre = cur;           
            cur = next;
        }

        return pre;
    }
}*/

 
 
 class Solution {

    public static Node helper(Node temp) {
        if (temp == null || temp.next == null) {
            return temp;
        }

        Node nhead = helper(temp.next);

        Node nxt = temp.next;
        nxt.next = temp;
        temp.next = null;

        return nhead;
    }

    Node reverseList(Node head) {
        return helper(head);
    }
}


 
}
