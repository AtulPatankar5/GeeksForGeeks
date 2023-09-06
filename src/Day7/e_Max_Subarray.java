package Day7;

public class e_Max_Subarray {

//	public static int subarray(int[] arr) {
//		int result = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			int sum = 0;
//			for (int j = i; j < arr.length; j++) {
//				sum = sum + arr[j];
//				if (sum >= result)
//					result = sum;
//			}
//		}
//		return result;
//	}

	public static int subarray(int[] arr) {
		int start = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] + start > arr[i])
				start = arr[i] + start;
			else
				start = arr[i];
		}
		return start;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
//		int [] arr= {1,-2,3,-1,2};
//		int [] arr= {5,8,3};
//		int[] arr = { -6, -1, -8 };
		int sum = subarray(arr);
		System.out.println(sum);
	}

}
