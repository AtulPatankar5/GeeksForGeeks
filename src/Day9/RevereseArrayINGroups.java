package Day9;

import java.util.Arrays;

public class RevereseArrayINGroups {

	public static void reverseArray(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < (n / 2); i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
			count++;
		}
		for (int i = 0; i < (arr.length - n ) / 2; i++) {
			int temp = arr[n + i];
			arr[n + i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6,7 };// 3,2,1,6,5,4
//		int[] arr = { 6, 2, 7, 8, 9, 2, 8, 2 };// 7,2,6,2,8,2,9,8
		int n = 2;
		reverseArray(arr, n);
		System.out.println(Arrays.toString(arr));
	}

}
