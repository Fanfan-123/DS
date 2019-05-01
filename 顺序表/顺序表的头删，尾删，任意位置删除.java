public class MyArrayList implements IArrayList{

    private int[] array; //保存数据的空间
    private int size; //保存有效数据个数、

    MyArrayList(int capacity){
        this.array = new int[capacity];
        this.size = 0;
    }
  public void popFront() {
        for(int i = 0;i <= this.size-2;i++){
            this.array[i] = this.array[i+1];
        }
        this.array[--this.size] = 0;
    }

    public void popBack() {
        if(this.size == 0){
            throw new Error();
        }
        this.array[--this.size] = 0;
       // this.size--;
    }

    public void remove(int index) {
        for(int i = index; i <= this.size-2;i++){
            this.array[i] = this.array[i+1];
        }
        this.array[--this.size] = 0;
    }  
 }
