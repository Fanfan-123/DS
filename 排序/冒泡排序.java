public class Code_冒泡排序 {
    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void bubbleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            //最小的数冒泡到最前面
            //有序[0,i)
            //无序[i,array.length)
            //要把最小的数冒泡到最开始，要从后往前冒
            for(int j = array.length-1; j > i; j--){
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9,3,1,5,2,4,3,8,7,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
