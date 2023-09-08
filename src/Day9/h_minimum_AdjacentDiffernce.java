package Day9;

import java.util.Arrays;

public class h_minimum_AdjacentDiffernce {

	public static int minimumSum(int[] arr) {
		int val = Integer.MAX_VALUE	;
		for (int i = 0; i < arr.length; i++) {
			int diff=0;
			if(i==arr.length-1) {
				diff=arr[0]-arr[arr.length-1];
			}
			else{
				diff = arr[i] - arr[i + 1];
			}
			if (diff < 0)
				diff = diff * -1;
			if (diff < val)
				val = diff;
		}
		return val;

	}

	public static void main(String[] args) {
//		int arr[] = { 8, -8, 9, -9, 10, -11, 12 };
		// 16 17 18 19 21 23 4
		int [] arr={10,-3,-4,7,6,5,-4,-1};
		int result=minimumSum(arr);
		System.out.println(result);
	}

}
