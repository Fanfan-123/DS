public class Test0007{
	//二分查找
	public static int binarySearch(int[] array1,int num){
		int left = 0;
		int right = array1.length-1;
		//不能确定循环次数，所以应该使用while循环，循环条件是 left<= right
		while(left <= right){
			int mid = left+(right-left)/2;
			if(array1[mid] == num){
				return mid;
			}else{
				if(array1[mid] > num){
					right = mid-1;
				}else{
					left = mid +1;
				}
			}
		}
		return -1;
	}

	//主方法	
	public static void main(String[] args){
		int[] array1 = new int[]{1,2,3,4,5,6,7,8};
		int num = 3;
		Test0007 ep1 = new Test0007();
		System.out.println(ep1.binarySearch(array1,num));
	}
}
