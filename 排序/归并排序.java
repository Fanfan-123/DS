public class Code_归并排序 {
    public static void main(String[] args) {

    }

    public static void mergeSort(int[] array){
        mergeSortInner(array,0,array.length,array);
    }
    private static void mergeSortInner(int[] array,int low,int high,int[] extra){
        //array[low,high)
        if(low == high-1){
            return;
        }
        if(low >= high){
            return;
        }
        //1.平均切分
        int mid = low + (high-low)/2;
        //[low,mid)+[mid,high)
        //2,分治算法处理所有两个小区间
        mergeSortInner(array,low,mid,extra);
        mergeSortInner(array,mid,high,extra);
        //左右两个小区间已经有序了
        merge(array,low,mid,high,extra);
    }
    private static void merge(int[] array,int low,int mid,int high,int[] extra){
        extra = new int[high - low];
        int i = low;//遍历array[low,mid)
        int j = mid;//遍历array[mid,high)
        int x = 0;//遍历extra

        while(i < mid && j < high){
            if(array[i] < array[j]){
                extra[x++] = array[i++];
            }else{
                extra[x++] = array[j++];
            }
        }
        while (i < mid){
            extra[x++] = array[i++];
        }
        while (j  < high){
            extra[x++] = array[j++];
        }
        for (int k = low;k < high;k++){
            array[k] = extra[k-low];
        }
    }
}
