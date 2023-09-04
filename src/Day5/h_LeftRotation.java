package Day5;

public class h_LeftRotation {

	public static void leftRotate(int[] arr) {
		int start = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = start;
	}

	public static void rightRotate(int[] arr) {
		int temp= arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0]=temp;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5,6,7,8,9 };
//		leftRotate(arr);
		rightRotate(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
