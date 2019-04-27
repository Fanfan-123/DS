public class Code{
class RNode{
        private int val;
        private RNode next;
        private RNode random;

        RNode(int v){
            this.val = v;
            this.next = null;
            this.random = null;
        }
    }
    public class Solution9{
        public RNode copyRandomList(RNode head){
            RNode cur = head;
            while (cur != null){
                RNode n = new RNode(cur.val);
                n.next = cur.next;
                cur.next = n;
                cur = cur.next.next;
            }

            cur = head;
            while (cur != null){
                RNode n = cur.next;
                if(cur.random == null){
                    n.random = null;
                }else{
                    n.random = cur.random.next;
                }
                cur = cur.next.next;
            }

            cur = head;
            RNode result = cur.next;
            while (cur != null){
                RNode n = cur.next;
                cur.next = n.next;
                if(n.next != null){
                    n = n.next.next;
                }
                cur = cur.next;
            }
            return result;
        }
    }
}
