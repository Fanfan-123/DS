public class Code_堆排序 {
    public static void heapSort(int[] array){
        //建大堆
        for (int i = (array.length-2)/2;i >= 0;i--){
            biggestHeapify(array,array.length,i);
        }

        //无序[0,array.length-j)
        //有序：[array.length-j,array.length)
        for (int j  = 0;j < array.length;j++){
            int t = array[0];
            array[0] = array[array.length-1-j];
            array[array.length-1-j] = t;

            biggestHeapify(array,array.length-1-j,0);
        }
    }

    //向下调整
    public static void biggestHeapify(int[] array,int size,int index){
        int max = 2 * index + 1;
        while(max < size){
            if(max+1 < size && array[max+1] > array[max]) {
                max+=1;
            }
            if(array[max] <= array[index]){
                    break;
            }
            int t = array[index];
            array[index] = array[max];
            array[max] = t;

            index = max;
            max = 2*index+1;
            }
        }
}
