package www.fanfan.com;

public class Practise1 implements ILinked{

    class Node{
        private Integer data;
        private Node next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public Practise1() {
        this.head = null;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
        }else {
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
        }else {
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    @Override
    public boolean addindex(int index, int data) {
        Node node = new Node(data);
        Node cur = this.head;
        int count = 0;
        if (index < 0 || index > getLength()){
            return false;
        }
        if (index == 0){
            if (this.head == null){
                this.head = node;
            }else {
                node.next = this.head;
                this.head = node;
            }
        }else {
            while (cur.next != null){
                cur = cur.next;
                count++;
                if (count == index-1){
                    node.next = cur.next;
                    cur.next = node;
                }
            }
        }
        return true;
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
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public boolean remove(int key) {
        Node cur = this.head;
        if (this.head == null){
            return false;
        }
        if (this.head.data == key){
            this.head = this.head.next;
        }
        while (cur.next != null){
            if (cur.next.data == key){
                cur.next = cur.next.next;
                return true;
            }else {
                cur = cur.next;
            }
        }
        return false;
    }

    @Override
    public void removeAllKey(int key) {
        if (this.head == null){
            return;
        }
        while (this.head.data == key){
            this.head = this.head.next;
            if (this.head == null){
                return;
            }
        }
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.data == key){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
    }

    @Override
    public int getLength() {
        Node cur = this.head;
        Integer count = 0;
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
        practise1.addFirst(20);
        practise1.addFirst(10);
        practise1.addFirst(5);
        practise1.display();
        practise1.addLast(11);
        practise1.addLast(22);
        practise1.addLast(33);
        practise1.display();
        practise1.addindex(0,0);
        practise1.addindex(2,88);
        practise1.addindex(practise1.getLength(),99);
        practise1.display();
        System.out.println(practise1.contains(11));
        System.out.println(practise1.contains(0));
        System.out.println(practise1.contains(99));
        practise1.remove(88);
        practise1.remove(0);
        practise1.remove(99);
        practise1.display();
        practise1.addFirst(5);
        practise1.addFirst(5);
        practise1.addFirst(5);
        practise1.addLast(33);
        practise1.addLast(33);
        practise1.addLast(33);
        practise1.addindex(6,11);
        practise1.addindex(6,11);
        practise1.display();
        practise1.removeAllKey(5);
        practise1.display();
        practise1.removeAllKey(11);
        practise1.display();
        practise1.removeAllKey(33);
        practise1.display();
        System.out.println(practise1.getLength());
    }
}
