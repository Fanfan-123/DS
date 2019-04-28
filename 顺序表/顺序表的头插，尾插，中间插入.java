public class MyArrayList{

    private int[] array; //保存数据的空间
    private int size; //保存有效数据个数、

    MyArrayList(int capacity){
        this.array = new int[capacity];
        this.size = 0;
    }

//头插
    public void pushFront(int item) {
        ensureCapacity();
        for(int i = size; i >= 1;i--){
            this.array[i] = this.array[i-1];
        }
        this.array[0] = item;
        this.size++;
    }
//尾插
    public void pushBack(int item) {
        ensureCapacity();
        this.array[this.size] = item;
        this.size++;
    }

   //中间插入
    public void add(int item, int index) {
        ensureCapacity();
        if(index < 0  || index > this.size){
            throw new Error();
        }
        //i 表示空间下标
        for(int i = this.size; i>= index+1;i++){
            this.array[i] = this.array[i-1];
        }
        this.array[index] = item;
        this.size++;
    }
    
    public void ensureCapacity() {
        if(this.size < this.array.length){
            return;
        }

        //(1)找新房子，一般找原来的两倍大
        int capacity = this.array.length*2;
        int[] newArray = new int[capacity];

        //(2)搬家
          for(int i = 0;i < newArray.length;i++){
              newArray[i] = this.array[i];
          }

        //(3)去学校登记新房子的位置，退掉老房子
        this.array = newArray;
    }
}
