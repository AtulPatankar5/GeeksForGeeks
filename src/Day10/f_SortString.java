package Day10;

import java.util.Arrays;

public class f_SortString {

	public static void main(String[] args) {
		// Approach 1 : Insertion Sort
		String str = "ROCK";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char index = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > index) {
					arr[j + 1] = arr[j];
					arr[j] = index;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		// Aproach 2: Selection Sort
		String str2 = "BOTTLE";
		char[] arr2 = str2.toCharArray();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					char temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));

		// Predefined sort method
		String str1 = "MOBILE";
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
