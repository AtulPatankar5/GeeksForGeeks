package Day9;

import java.util.Arrays;

public class e_PrefixSumTechnique {

	public static int[] sumArray(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			temp[i] = temp[i - 1] + arr[i];
		}
		return temp;
	}

	public static int getSum(int a, int b, int[] NewSumArray) {
		int result;
		if (a - 1 >= 0)
			result = NewSumArray[b] - NewSumArray[a - 1];
		else
			result = NewSumArray[b];
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 8, 3, 9, 6, 5, 4 };
		int[] NewSumArray = sumArray(arr);

		System.out.println(Arrays.toString(NewSumArray));

		int sum1 = getSum(0, 2, NewSumArray);
		int sum2 = getSum(1, 3, NewSumArray);
		int sum3 = getSum(2, 6, NewSumArray);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
