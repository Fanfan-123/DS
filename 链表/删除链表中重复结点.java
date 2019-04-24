package www.fanfan.com;

/**
 * author:kelly_fanfan
 */
public class NowCoder_删除链表中重复结点 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode deleteDuplication(ListNode pHead){
            if(pHead == null){
                return pHead;
            }
            ListNode dum = new ListNode(0);
            dum.next = pHead;
            ListNode pre = dum;
            ListNode p1 = pHead;
            ListNode p2 = pHead.next;
            while(p2 != null){
                if(p2.val != p1.val){
                    pre = pre.next;
                    p1 = p1.next;
                    p2 = p2.next;
                }else{
                    while(p2 != null && p1.val == p2.val){
                        p2 = p2.next;
                    }
                    pre.next = p2;
                    p1 = p2;
                    if(p2 != null){
                        p2 = p2.next;
                    }
                }
            }
            return dum.next;
        }

    }
}
