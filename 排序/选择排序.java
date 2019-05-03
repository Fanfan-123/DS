public class Code_选择排序 {
    private static void swap(int[] array,int min,int i){
        int t = array[min];
        array[min] = array[i];
        array[i] = t;
    }

    public static void selectSort(int[] array){
        //每次选择一个最小的数放在无序部分的最开始位置
        for(int i = 0; i < array.length; i++){
            //有序{0，i)
            //无序[i,array.length)
            int min = i; //记录最小数所在下标
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            swap(array,min,i);
        }
    }

    public static void main(String[] args) {
        int[] array = {9,3,1,5,2,4,3,8,7,6};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
