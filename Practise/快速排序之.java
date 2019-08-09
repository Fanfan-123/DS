package www.sort;

import java.util.Arrays;

public class QuickSortTest2 {
    public static void main(String[] args) {
        int[] array = {9,2,5,7,3,8,3,6,1};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array,int left,int right){
        if (left >= right){
            return;
        }
        int pivot = threePart(array,left,right);
        quickSort(array,left,pivot-1);
        quickSort(array,pivot+1,right);
    }
    public static int threePart(int[] array,int left,int right){
        int pivot = array[right];
        while (left < right){
            while (left < right && array[left] <= pivot){
                left++;
            }
            array[right] = array[left];
            while (left < right && array[right] >= pivot){
                right--;
            }
            array[left] = array[right];
        }
        array[left] = pivot;
        return left;
    }
}
