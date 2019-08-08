package www.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {4,6,3,5,4,9,7,0};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectSort(int[] array){
        int i,j;
        for (i = 0;i < array.length;i++){
            int max = 0;
            for (j = 0;j < array.length-i;j++){
                if (array[j] > array[max]){
                    max = j;
                }
            }
            int temp = array[max];
            array[max] = array[j-1];
            array[j-1] = temp;
        }
    }
}
