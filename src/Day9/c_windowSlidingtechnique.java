package Day9;

public class c_windowSlidingtechnique {
//	public static int window(int[] arr, int n) {
//		int start = arr[0];
//		for (int i = 0; i <= arr.length-n; i++) {
//			int sum = 0;
//			int end=i+n-1;
//			for (int j = i; j <= end; j++) {
//				sum = sum + arr[j];
//			}
//			if (sum > start)
//				start = sum;
////			System.out.println(i);
//		}
//		return start;
//	}

	public static int window(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		int max = sum;
		for (int i = n; i < arr.length; i++) {
			sum = sum + arr[i] - arr[i - n];
			if (sum > max)
				max = sum;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 30, -5, 20, 7 };//n=3
//		int [] arr= {5,-10,6,90,3};//n=2
		int result = window(arr, 3);
		System.out.println(result);
	}

}
