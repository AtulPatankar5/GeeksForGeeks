package Day5;

public class e_Reverse_Array {
// Time COmplexity= O(n)
	public static void reverseArray(int[] arr) {
		int last = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[last - i];
			arr[last - i] = temp;
		}
	}

	public static void main(String[] args) {
//		int[] arr = { 2, 5, 4, 7, 9 };
//		int []arr= {1,2};
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		reverseArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
