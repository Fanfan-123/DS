public class Code_快速排序 {
    public static void main(String[] args) {
        int[] array = {9,2,5,7,3,8,3,6,1};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array,int left,int right){
        if(left >= right){
            return;
        }
        //1，选择一个基准值
        int index = sanShuQuZhong(array,left,right);
        //找到一个基准值，把基准值换到最后
        swap(array,index,right);
        //2，遍历整个区间，把区间分成三个部分
        int pivot = partition(array,left,right);
        //3，减治算法
        quickSort(array,left,pivot-1);
        quickSort(array,pivot+1,right);
    }
    //取基准值
    private static int sanShuQuZhong(int[] array,int left,int right){
        int mid = left + (right-left)/2;
        if(left > right){
            if(left < mid){
                return left;
            }else if (mid > right){
                return mid;
            }else{
                return right;
            }
        }else{
            if(right < mid){
                return right;
            }else if (mid > left){
                return mid;
            }else {
                return left;
            }
        }
    }
    //交换
    private static void swap(int[] array,int a,int b){
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
    //划分三个区间
    private static int partition1(int[] array,int left,int right) {
        int begin = left;
        int end = right;
        int pivot = array[right];
        while (begin < end) {
            while (begin < end && array[begin] <= pivot) {
                begin++;
            }
            array[end] = array[begin] ;
            while (begin < end && array[end] >= pivot) {
                end--;
            }
            array[begin] = array[end];
        }
        array[begin] = pivot;
        return begin;
    }
}
