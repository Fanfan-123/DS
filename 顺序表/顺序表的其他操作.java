package www.fanfan.com;

import java.util.Arrays;

public class MySequence implements ISequence {
    private Object[] elem;
    private int usedSize;//有效数据个数
    private static final int DEFAULT_SIZE = 10;

    public MySequence() {
        this.elem = new Object[DEFAULT_SIZE];
    }

    //判断数组是否已满
    private boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    @Override
    public boolean add(int pos, Object data) {
        //1. post 位置的合法性进行判断
        if (pos < 0 || pos > usedSize){
            return false;
        }
        //2. 判断是否为满
        if (isFull()){
            //2倍扩容
            //System.arraycopy();
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);

//            Object[] newElem = new Object[DEFAULT_SIZE*2];
//            newElem = elem;
        }
        for (int i = this.usedSize-1;i>=pos;i--){
            this.elem[i+1] = this.elem[i];
        }
//        for (int i = usedSize+1; i > pos; i--){
//            elem[i] = elem[i-1];
//        }
        this.elem[pos] = data;
        this.usedSize++;
        return true;
    }

    private boolean isEmpty(){
        return this.usedSize == 0;
    }
    @Override
    public int search(Object key) {
        //返回第一个key对应的下标就可以
        //1. 判断顺序表是否为空
        if (isEmpty()){
            return  -1;
        }
        for (int i = 0; i < this.usedSize; i++){
            //注意，此时数组为对象数组，比较时不能使用==，要用equals
            if (this.elem[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object key) {
        if (isEmpty()){
            return  false;
        }
        for (int i = 0; i < this.usedSize; i++){
            //注意，此时数组为对象数组，比较时不能使用==，要用equals
            if (this.elem[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getPos(int pos) {
        //1. pos 位置是否合法
        //2. 顺序表是否为空
        if (pos < 0 || pos >= this.usedSize){
            return null;
        }
        if (isEmpty()){
            return null;
        }
        return this.elem[pos];
    }

    @Override
    public Object remove(Object key) {
        int index = search(key);
        if (index == -1){
            return null;
        }
        for (int i = index+1;i < this.usedSize;i++){
            this.elem[i-1] = this.elem[i];
        }
        this.usedSize--;
        return null;
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public void display() {
        for (int i = 0; i < this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    @Override
    //防止内存泄漏
    public void clear() {
        for (int i = 0;i < this.usedSize;i++){
            this.elem[i] = null;
        }
    }

    public static void main(String[] args) {
        MySequence mySequence = new MySequence();
        mySequence.add(0,1);
        mySequence.add(1,2);
        mySequence.add(2,3);
        mySequence.remove(2);
        mySequence.display();
    }
}
