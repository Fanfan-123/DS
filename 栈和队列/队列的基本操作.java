package www.fanfan.com;

/**
 * author:kelly_fanfan
 */
public class MyQueue {
    private  class Node{
        int val;
        Node next;
        Node(int v){
            this.val = v;
            this.next = null;
        }
    }

    private Node head;
    private Node last;
    
    MyQueue(){
        this.head = this.last = null;
    }
    //入队列_尾插
    public void push(int v){
        Node node = new Node(v);
        if(this.head == null){
            this.head = this.last = node;
        }else {
            this.last.next = node;
        }
    }

    //出队列——头删
    public int pop(){
        int v = this.head.val;
        this.head = this.head.next;
        if(this.head == null){
            this.last = null;
        }
        return v;
    }

    //返回队首元素
    public int front(){
        return this.head.val;
    }
    
}
