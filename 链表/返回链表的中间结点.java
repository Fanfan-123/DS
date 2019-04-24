package www.fanfan.com;

/**
 * author:kelly_fanfan
 * 返回链表的中间结点
 */

public class LeetCode876 {
    class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    class Solution {
        public ListNode middleNode(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode cur1 = head;
            ListNode cur2 = head;
            while (cur1 != null && cur1.next != null){
                cur1 = cur1.next.next;
                cur2 = cur2.next;
            }
            return cur2;
        }
    }
}
