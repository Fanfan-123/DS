package www;

import java.util.Arrays;

public class ShellSortTest {
    public static void main(String[] args) {
        int[] array = {9,2,5,7,3,8,3,6,1};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shellSort(int[] array){
        int gap = array.length;
        int i,j;
        while (gap != 1){
            gap = gap/3+1;
            for (i = 0;i < array.length;i=i+gap){
                int temp = array[i];
                for (j = i-gap;j >= 0;j=j-gap){
                    if (temp < array[j]){
                        array[j+gap] = array[j];
                    }else {
                        break;
                    }
                }
                array[j+gap] = temp;
            }
        }
    }
}
