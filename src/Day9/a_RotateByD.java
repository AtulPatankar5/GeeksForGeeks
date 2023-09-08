package Day9;

import java.util.Arrays;

public class a_RotateByD {

	public static void rotate(int[] arr, int n) {
		for (int j = 0; j <= n; j++) {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		rotate(arr, 2);
		System.out.println(Arrays.toString(arr));
	}

}
