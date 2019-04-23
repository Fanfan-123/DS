package www.fanfan.com;

/**
 * author:kelly_fanfan
 */
public class Code_链表复习 {

    class Node{
        private int val;
        private Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    
     class Solution1 {
        public Node removeElements(Node head, int val){
            if(head == null){
                return head;
            }
            Node cur = head;
            while(cur != null){

                if(cur.next.val == val){
                    cur = cur.next.next;
                }else{
                    cur = cur.next;
                }
            }
            if(head.val == val){
                return head.next;
            }else{
                return head;
            }
        }
    }
 }
