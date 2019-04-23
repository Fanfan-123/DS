package www.fanfan.com;

/**
 * author:kelly_fanfan
 * 反转链表
 */
public class LeetCode206 {

    class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode cur = head;
            ListNode result = null;

            while (cur != null){
                ListNode next = cur.next;

                cur.next = result;
                result = cur;

                cur = next;
            }
            return result;
        }
    }
}
