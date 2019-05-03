public class Code_希尔排序 {
    
    public static void shellSort(int array[]) {
        int gap = array.length;
        while(true){
            gap = (gap/3) + 1;

            insertSortWithGap(array,gap);

            if(gap == 1){
                break;
            }
        }
    }

    public static void insertSortWithGap(int array[],int gap){
        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int j = i - gap;
            for(; j >= 0 && key < array[j]; j = j-gap){
                array[j+gap] = array[j];
            }
            array[j+gap] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {9,3,1,5,2,4,3,8,7,6};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
