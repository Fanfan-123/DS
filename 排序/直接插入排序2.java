package www.sort;

import java.util.Arrays;

public class InsertSortTest {
    public static void main(String[] args) {
        int[] array = {9,4,6,3,2,5,4,7};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertSort(int[] array){
        int i = 0;
        int j = 0;
        for (i = 0;i < array.length;i++){
            int temp = array[i];
            for (j = i-1;j >= 0;j--){
                if (temp < array[j]){
                    array[j+1] = array[j];
                }else {
                   break;
                }
            }
                array[j+1] = temp;
        }
    }
}
