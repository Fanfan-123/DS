/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public int getLength(ListNode head){
        int count = 0;
        ListNode cur = head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null){
            return null;
        }
        if(k <= 0 || k > getLength(head)){
            return null;
        }
        ListNode cur = head;
        for(int i = 0;i < getLength(head)-k;i++){
            cur = cur.next;
        }
        return cur;
        
    }
}
