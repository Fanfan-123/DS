public class Code_插入排序 {

    //1.
    public static void insertSort(int array[]) {
        for(int i = 0; i < array.length; i++){
            //有序：[0,i)
            //无序：[i,length)

            //遍历，找到合适位置
            int j = 0;
            for(j = i-1;j >= 0;j--){
               if(array[i] >= array[j]){
                   break;
               }
            }

            //将数字插入到合适的位置，
            //从顺序表的中间位置插入
            int key = array[i];
            for(int k = i; k > j + 1; k--){
                array[k] = array[k-1];
            }
            array[j+1] = key;
        }

    }

    //2. 边找边搬
    public static void insertSort2(int array[]){
        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            for(; j >= 0 && key < array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }
    

    public static void main(String[] args) {
        int[] array = {9,3,1,5,2,4,3,8,7,6};
        insertSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
