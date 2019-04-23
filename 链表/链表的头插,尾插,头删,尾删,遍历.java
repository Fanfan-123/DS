package www.bit.java;

/**
 * author:kelly_fanfan
 */
public class MyLinkedList {


    //内部类
    //表示链表中的一个结点
    public class Node{
        public int value;//保存的数据
        public Node next;//下一个结点的线索

        Node(int v){
            this.value = v;
            this.next = null;
        }
    }

    //头结点，保存链表中第一个结点的引用
    //如果一个结点都没有，head=null
    private Node head;

    MyLinkedList(){

        this.head = null;
    }

    //1.头插,插入的是一个数据
    //头插结点为空时 this.head = node
    void pushFront(int item) {
        Node node = new Node(item);
        node.next = this.head;
        this.head = node;
    }

    //2. 尾插
    void pushBack(int item){
        Node node = new Node(item);
        if(this.head == null){
            this.head = node;
        }else{
            Node last = getLast();
            last.next = node;
        }
    }
    //获得最后一个结点
    private Node getLast() {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //3.头删
    void popFront(){
        if(this.head == null){
            throw new Error();
        }else{
            this.head = this.head.next;
        }
    }

    //4. 尾删
    void popBack(){
        if(this.head == null){
            throw new Error();
        }else{
            if(this.head.next == null){
                this.head = null;
            }else{
                Node lastLast = getLastLast();
                lastLast.next = null;
            }
        }
    }
        //找到倒数第二个结点
        private Node getLastLast(){
            Node cur = this.head;
            while(cur.next.next != null){
                cur = cur.next;
            }
            return cur;
        }

        //5. 遍历
        public void disPlay(){
            Node cur = this.head;
            while(cur != null){
                System.out.format("%d-->",cur.value);
                cur = cur.next;
            }
        }

}

