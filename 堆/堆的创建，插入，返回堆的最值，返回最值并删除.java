class Heap{
    private int[] array;
    private int size;

    Heap(int[] array){
        this.array = new int[10000];
        for(int i = 0; i < array.length;i++){
            this.array[i] = array[i];
        }
        this.size = array.length;
        createHeap(this.array,this.size);
    }

    //返回堆里的最值
    public int top(){
        return array[0];
    }

    //返回堆里最大的数并且删掉
    //时间复杂度：O（log(n))
    public int pop(){
        int v = array[0];
        array[0] = array[size-1];
        size--;
        heapify(array,0,size);

        return v;
    }

    //插入
    //时间复杂度：O（log（n))
    public void push(int v){
        array[size++] = v;
        adjustUp(array,size,size-1);
    }

    public void adjustUp(int[] array,int size,int index){
        while(index > 0){
            int parent = (index-1)/2;
            if(array[index] <= array[index]){
               break;
            }
            int t = array[index];
            array[parent] = array[index];
            array[index] = t;
            index = parent;
        }
    }

    //向下调整
    public  void heapify(int[] tree,int index,int size){

        int left = 2*index + 1;
        if(left >= size){
            return;
        }

        int right = 2*index + 1;
        int max = left;
        if(right < size && tree[right] > tree[left]){
            max = right;
        }

        if (tree[index] >= tree[max]){
            return;
        }
        int t = tree[index];
        tree[index] = tree[max];
        tree[max] = t;
        heapify(tree,max,size);
    }
    //建堆
    private void createHeap(int[] array,int size){
        for(int i = (size-2)/2;i >= 0;i--){
            heapify(array,i,size);
        }
    }
}
