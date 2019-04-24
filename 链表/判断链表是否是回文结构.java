package www.fanfan.com;

/**
 * author:kelly_fanfan
 */
public class NowCode_回文 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    //回文
    //1.先找到中间结点
    //2.把中间结点之后的结点链表反转
    public class PalindromeList {

        public int legth(ListNode A){
            ListNode cur = A;
            int len = 0;
            while(cur != null){
                len++;
                cur = cur.next;
            }
            return len;
        }

        public boolean chkPalindrome(ListNode A){

            int halfLen = legth(A)/2;
            ListNode cur = A;
            ListNode mid = A;
            ListNode newMid = null;

            for(int i = 0; i < halfLen;i++){
                mid = mid.next;
            }
            while(mid != null){
                ListNode next = mid.next;
                mid.next = newMid;
                newMid = mid;
                mid = next;
            }
            while(newMid != null){
                if(cur.val != newMid.val){
                    return false;
                }else{
                    cur = cur.next;
                    newMid = newMid.next;
                }
            }
            return true;
        }
    }

}
