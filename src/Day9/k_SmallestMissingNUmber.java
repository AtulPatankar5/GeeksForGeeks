package Day9;

public class k_SmallestMissingNUmber {
	public static void missingNumber(int[] arr) {
		int val = 0, start = 100000;
		int store = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i + 1] != val) {
				val = arr[i];
				val++;
				if (val - arr[i] < start) {
					store = val;
					start = val - arr[i];
				}
			}
		}
		System.out.println(store);
	}

	public static void main(String[] args) {
//		int arr[] = { 0, -10, 1, 3, -20 };
		int arr[]={1,2,3,4,5};
//		Output: 2
		missingNumber(arr);
	}

}
