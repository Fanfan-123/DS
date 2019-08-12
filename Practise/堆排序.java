package www.heap;

import java.util.Arrays;

public class HeapSoretTest {
    public static void adjustDown(int[] array, int index,int size) {
        int max = 2 * index + 1;
        while (max < size) {
            if ((max + 1) < size && array[max + 1] > array[max]) {
                max += 1;
            }
            if (array[index] >= array[max]) {
                break;
            }
            int temp = array[index];
            array[index] = array[max];
            array[max] = temp;
            index = max;
            max = index * 2 + 1;
        }
    }
        //建堆
        public static void creatHeap(int[] array){
            for (int i = (array.length-1)/2;i >= 0;i--){
                adjustDown(array,i,array.length);
        }
            for (int i = 0;i < array.length;i++){
                int t = array[0];
                array[0] = array[array.length-1-i];
                array[array.length-1-i] = t;
                adjustDown(array,0,array.length-1-i);
            }
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,7,9,0,5,3,2};
        creatHeap(array);
        System.out.println(Arrays.toString(array));
    }
}
