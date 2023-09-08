package Day8;

import java.util.Arrays;

public class SortArray {
	public static void sort(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			for (int i = j - 1; i >= 0; i--) {
				if (arr[i] > key) {
					arr[i + 1] = arr[i];
					arr[i] = key;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		int[] arr = { 5,2,1,9,7 };
//		int [] arr= {1,2,5,7,2,10,8};
//		int[] arr= {1,2,31,19,28,6,5};
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
