package www.fanfan.com;

/**
 * author:kelly_fanfan
 */
public class NoewCode_链表中倒数第k个结点 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        public ListNode FindKthToTail(ListNode head,int k) {
            if(head == null){
                return null;
            }
            ListNode p1 = head;
            ListNode p2 = head;
            for(int i = 0;i < k;i++){
                if(p1 == null){
                    return null;
                }else{
                    p1 = p1.next;
                }
            }
            while(p1 != null){
                p1 = p1.next;
                p2 = p2.next;
            }
            return p2;
        }
    }
}
