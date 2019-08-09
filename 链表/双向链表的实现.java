package www.fanfan.com;

public class Practise1 implements IDoubleLinked{

    class Node{
        private Integer data;
        private Node pre;
        private Node next;
        public Node(Integer data){
            this.data = data;
            this.pre = null;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    public Practise1(){
        this.head = null;
        this.tail = null;
    }
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else {
            this.head.pre = node;
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else {
            tail.next = node;
            node.pre = tail;
            this.tail = node;
        }
    }

    @Override
    public boolean addindex(int index, int data) {
        Node node = new Node(data);
        if (index < 0 || index > getLength()){
            return false;
        }
        if (index == 0){
            addFirst(data);
            return true;
        }
        if (index == getLength()){
            addLast(data);
            return true;
        }
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            cur = cur.next;
            count++;
            if (count == index){
                node.next = cur;
                cur.pre.next = node;
                node.pre = cur.pre;
                cur.pre = node;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        if (this.head == null){
            return false;
        }
        while (cur != null){
            if (cur.data == key){
                return true;
            }else {
                cur = cur.next;
            }
        }
        return false;
    }

    @Override
    public int remove(int key) {
        Integer oldData = 0;
        if (this.head == null){
            try {
                throw new Exception("链表为空");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.head.data == key){
            oldData = this.head.data;
            this.head = this.head.next;
            this.head.pre = null;
            return oldData;
        }
        Node cur = this.head;
        while (cur.next != null){
            if (cur.data == key){
                oldData = cur.data;
                cur.pre.next = cur.next;
                cur.next.pre = cur.pre;
                return oldData;
            }else {
                cur = cur.next;
            }
        }
        if (this.tail.data == key){
            oldData = cur.data;
            tail.pre.next = null;
            tail = tail.pre;
            return oldData;
        }
        return oldData;
    }

    @Override
    public void removeAllKey(int key) {
        if (this.head == null){
            return;
        }
        while (this.head.data == key){
            this.head = this.head.next;
            this.head.pre = null;
            if (this.head == null){
                return;
            }
        }
        Node cur = this.head;
        while(cur.next != null){
            if (cur.data == key){
                cur.pre.next = cur.next;
                cur.next.pre = cur.pre;
            }else {
                cur = cur.next;
            }
        }
        if (tail.data == key){
            tail.pre.next = null;
            tail = tail.pre;
        }
    }

    @Override
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        Practise1 practise1 = new Practise1();
        practise1.addFirst(1);
        practise1.addFirst(2);
        practise1.addFirst(3);
        practise1.display();
        System.out.println(practise1.getLength());
        practise1.addLast(12);
        practise1.addLast(23);
        practise1.addLast(34);
        practise1.display();
        practise1.addindex(3,66);
        practise1.addindex(4,55);
        practise1.addindex(0,0);
        practise1.addindex(practise1.getLength(),99);
        practise1.addindex(practise1.getLength()-1,88);
        practise1.display();
        System.out.println(practise1.contains(88));
        System.out.println(practise1.contains(0));
        System.out.println(practise1.contains(99));
        practise1.remove(0);
        practise1.display();
        practise1.remove(1);
        practise1.display();
        practise1.remove(99);
        practise1.display();
        practise1.addFirst(3);
        practise1.addLast(88);
        practise1.addindex(3,55);
        practise1.display();
        practise1.removeAllKey(3);
        practise1.display();
//        practise1.removeAllKey(55);
//        practise1.display();
//        practise1.removeAllKey(88);
//        practise1.display();
    }
}
