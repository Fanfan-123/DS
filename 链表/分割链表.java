package www.fanfan.com;

/**
 * author:kelly_fanfan
 */
public class NowCoder_分割链表 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public class Partition {
        public ListNode partition(ListNode pHead, int x) {
            if(pHead == null || pHead.next == null){
                return pHead;
            }
            ListNode cur = pHead;
            ListNode small = null;
            ListNode smallLast = null;
            ListNode big = null;
            ListNode bigLast = null;

            while(cur != null){
                ListNode next = cur.next;
                cur.next = null;
                if(cur.val < x){
                    if(small == null){
                        small = cur;
                    }else{
                        smallLast.next = cur;
                    }
                    smallLast = cur;
                }else{
                    if(big == null){
                        big = cur;
                    }else{
                        bigLast.next = cur;
                    }
                    bigLast = cur;
                }
                cur = next;
            }
            if(small == null){
                return big;
            }else{
                smallLast.next = big;
                return small;
            }
        }
    }

}
