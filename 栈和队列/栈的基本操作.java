public class MyStack {
    private int[] array;
    int top;
    MyStack(){
        this.array = new int[100];
        this.top = 0;
    }

    //压栈
    public void push(int v){
        this.array[this.top++] = v;
    }
    //出栈
    public int pop(){
        return this.array[--this.top];
    }
    //查看栈顶元素
    public int peek(){
        return this.array[top-1];
    }
    //查看栈中元素大小
    public int size(){
        return this.top;
    }

}
