package www.fanfan.com;

/**
 * author:kelly_fanfan
 * 移除链表元素
 */
public class leetCode203 {

     public class ListNode {
      int val;
     ListNode next;
     ListNode(int x) {
         val = x;
     }
  }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            
            ListNode cur = head
            ListNode result = null;
            ListNode last = null;
            
            while(cur != null){
                ListNode next = cur.next;

                if(cur.val != val){
                    
                    cur.next = null;
                    if(result == null){
                        result = cur;
                   }else{
                        last.next = cur;
                    }
                    
                    last = cur;
                }
                cur = next;
            }
            return result;
        }
   }
   
}
}
