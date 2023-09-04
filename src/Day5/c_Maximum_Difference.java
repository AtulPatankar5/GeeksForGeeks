package Day5;

public class c_Maximum_Difference {

	public static int maxDifff(int[] arr) {
		int i = 0;
		int j = 1;
		int max = arr[j] - arr[i];
		int count = 0;
		for (i = 0; i < (arr.length - 1); i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					System.out.println(++count);
					if ((arr[j] - arr[i]) > max)
						max = arr[j] - arr[i];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
//		int[] arr = { 1, 2, 3, 4, 6, 8, 10 };
//		int[] arr = { 7, 9, 5, 6, 3, 2 };
//		int[] arr = { 10, 20, 30 };
//		int [] arr= {30,10,8,2};
		int max = maxDifff(arr);
		System.out.println(max);
	}
}