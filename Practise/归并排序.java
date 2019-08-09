package www.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {9,2,5,7,3,8,3,6,1};
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] array,int left,int right){
        if (left >= right){
            return;
        }
        int mid = left+(right-left)/2;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,right,mid);
    }
    public static void merge(int[] array,int left,int right,int mid){
        int[] extra = new int[array.length];
        int m = mid+1;
        int l = left;
        int x = left;
        while (left <= mid && m <= right){
            if (array[left] <= array[m]){
                extra[x++] = array[left++];
            }else {
                extra[x++] = array[m++];
            }
        }
        while (left <= mid){
            extra[x++] = array[left++];
        }
        while (m <= right){
            extra[x++] = array[m++];
        }
        while (l <= right){
            array[l] = extra[l++];
        }
    }
}
