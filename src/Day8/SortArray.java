package Day8;

import java.util.Arrays;

public class SortArray {
	public static void sort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			int start = i;
			System.out.println(start);
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
				i--;
			}
			i = start;
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 31, 19, 28, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
