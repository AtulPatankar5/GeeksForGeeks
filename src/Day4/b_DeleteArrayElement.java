package Day4;

public class b_DeleteArrayElement {

	public static int deleteAtPosition(int[] arr, int val) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == val)
				break;
		}
		if (i == arr.length)
			return arr.length;
		for (int j = i; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		return arr.length - 1;
	}

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 9;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = 8;
		int val = 9;
		int newSize = deleteAtPosition(arr, val);

		for (int i = 0; i < newSize; i++) {
			System.out.println(arr[i]);
		}
	}
}
