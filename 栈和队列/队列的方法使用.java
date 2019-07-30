package www.fanfan.com;

//队列：先进先出
//使用链表实现，且队列有头有尾可以定义头节点和尾结点
public class MyQueue implements QueueInterface {
    //定义节点类
    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //定义头节点和尾节点
    //定义队列的长度
    private Node head;
    private Node tail;
    private int usedSize;

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.usedSize = 0;
    }

    //判断队列是否为空
    //头节点为空即为空队列
    @Override
    public boolean empty() {
        return this.head == null;
    }

    //向队列中添加元素，尾插
    //1. 如果队列为空,直接插入，即头节点=尾节点=新插入的节点
    //2. 如果队列不为空，则在尾结点插入，不用管头节点
    //3.插入完成结束之后，队列长度加一
    @Override
    public void add(int item) {
        Node node = new Node(item);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else {
            this.tail.next = node;
            this.tail = node;
        }
        this.usedSize++;
    }

    //返回队首元素，但是不删除
    //1. 如果队列为空，抛出异常
    //2. 如果队列不为空，返回队首元素，头节点后移
    @Override
    public int peek() {
        if (empty()){
            throw new IndexOutOfBoundsException("队列为空不能返回队首元素");
        }
        return this.head.data;
    }

    //返回队首元素并且删除
    //1. 如果队列为空，抛出异常
    //2. 如果队列不为空，
    //2.1 先保存队首元素的数据
    //2.2 头节点后移
    //2.3 队列长度减一
    //返回保存的队首元素
    @Override
    public int poll() {
        if (empty()){
            throw new IndexOutOfBoundsException("队列为空不能返回队首元素");
        }
        int temp = this.head.data;
        this.head = this.head.next;
        this.usedSize--;
        return temp;
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}


package www.fanfan.com;

public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.empty());
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.display();

        System.out.println(myQueue.peek());
        myQueue.display();

        System.out.println(myQueue.poll());
        myQueue.display();

        System.out.println(myQueue.size());
    }
}

