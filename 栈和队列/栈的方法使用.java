package www.fanfan.com;
//栈：先进后出
//1. 使用数组实现,需要定义一个数组
//2. 每次插入删除等操作都离不开栈顶，定义一个栈顶
//   栈中元素存放下标从0开始，即栈顶开始时下标为0，
//   当把元素插进来以后，栈顶后移，当栈顶大小=数组长度之后栈满
public class MyStack implements StackInterface{

    private int[] elem;
    private int top;

    public MyStack() {
        this.elem = new int[5];
        this.top = 0;
    }

    //判断栈是否为空，当栈顶大小0的时候，栈为空
    @Override
    public boolean empty() {
        return this.top == 0;
    }

    //压栈
    //1. 判断栈是否已满，满的话抛出异常
    //2. 若栈不满
    //2.1 在栈顶位置插入元素
    //2.2 栈顶后移
    @Override
    public void push(int item) {
        if(this.top == this.elem.length){
            throw new IndexOutOfBoundsException("数组已满");
        }
        this.elem[this.top] = item;
        this.top++;
    }

    //返回栈顶元素，但不出栈
    //1. 判断栈是否为空，若为空，抛出异常
    //2. 若栈不为空，直接返回栈顶元素
    @Override
    public int peek() {
        if (empty()){
            throw new IndexOutOfBoundsException("栈不能为空");
        }
        return this.elem[this.top-1];
    }

    //返回栈顶元素，并且删除
    //1. 判断栈是否为空，若为空，抛出异常
    //2. 若栈不为空，直接返回栈顶元素
    @Override
    public int pop() {
        if (empty()){
            throw new IndexOutOfBoundsException("栈不能为空");
        }
        int temp = this.elem[top-1];
        top--;
        return temp;
    }

    //返回栈中元素个数
    @Override
    public int size() {
        return this.top;
    }

    //打印栈中元素
    public void display(){
       for (int i = 0; i < this.top; i++){
           System.out.print(this.elem[i]+" ");
       }
        System.out.println();
    }
}

