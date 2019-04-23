package www.fanfan.com;

/**
 * author:kelly_fanfan
 * 合并两个有序链表
 */
public class LeetCode21 {
    class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode cur1 = l1;
            ListNode cur2 = l2;
            ListNode result = null;
            ListNode last = null;

            if(cur1 == null){
                return cur2;
            }
            if(cur2 == null){
                return cur1;
            }
            while(cur1 != null && cur2 != null){
                if(cur1.val <= cur2.val){
                    ListNode next = cur1.next;

                    cur1.next = null;
                    if(result == null){
                        result = cur1;
                    }else{
                        last.next = cur1;
                    }
                    last = cur1;
                    cur1 = next;
                }else{
                    ListNode next = cur2.next;
                    cur2.next = null;
                    if(result == null){
                        result = cur2;
                    }else{
                        last.next = cur2;
                    }
                    last = cur2;
                    cur2 = next;
                }
            }
            if(cur1.next == null){
                last.next = cur2;
            }
            if(cur2.next == null){
                last.next = cur1;
            }
           return result;
        }
    }
}
