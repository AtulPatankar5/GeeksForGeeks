package Day6;

public class b_leftRotatebyD_Optimized {
	public static void InverseRotate(int[] arr, int start, int end) {
//	int i=start-start;
		int j = end - start +1;
		for (int i = 0; i < j-1 ; i++) {
			int temp = arr[i + start];
			arr[i + start] = arr[j - 1 - i];
			arr[j - 1 - i] = temp;
		}

	}

	public static void leftRotateByD(int[] arr, int d) {

		InverseRotate(arr, 0, d-1 );
		InverseRotate(arr, d, arr.length - 1);
		InverseRotate(arr, 0, arr.length - 1);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int d = 2;
		leftRotateByD(arr, d);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
