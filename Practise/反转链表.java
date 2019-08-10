/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode result = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = result;
            result = cur;
            cur = temp;
        }
        return result;
    }
}
