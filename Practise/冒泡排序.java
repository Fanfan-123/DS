package www.sort;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] array = {9,2,5,7,3,8,3,6,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){
        int j,i;
        //i表示当前有序数组的元素个数
        for (i = 0;i < array.length;i++){
            //假设数组有序
            boolean sort = true;
            //j是当前无序数组元素个数，因为array[j] 与 array[j+1]要进行比较，所以j的最大长度要再减去1
            //比较相邻元素，保证把最大的元素交换到无序数组的末尾
            for (j = 0;j < array.length-i-1;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    //一旦进行交换，说明这个数组肯定不是有序数组 ，令sort=false
                    sort = false;
                }
            }
            //每次排序一趟后，判断sort的值，
            // 如果为true，则说明数组已经有序，不必再惊醒比较排序
            //如果为false，则数组还是无序的，还需要进行排序
            if (sort == true){
                break;
                
            }
        }
    }
}
