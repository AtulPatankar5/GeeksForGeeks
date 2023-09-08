package Day9;

public class f_LaregstAndSecondLargest {
	public static void largest(int[] arr) {
		int max = arr[0];
		int second = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				second = max;
				max = arr[i];
			} else {
				if (arr[i] > second && arr[i] != max)
					second = arr[i];
			}
		}
		System.out.println(max + " " + second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 2, 1, 4, 10 };
//		int[] arr = { 10, 5, 8, 20 };
//		int[] arr = { 20, 10, 20, 8, 17 };
//		int[] arr = { 10, 10, 10 };
		largest(arr);
	}

}
