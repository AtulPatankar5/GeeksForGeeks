package Day8;

public class c_InsertatIndex {

	public static void insertAtIndex(int val, int index, int[] arr) {

		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = val;
	}

	public static void main(String[] args) {

		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int val = 50;
		int index = 2;
		insertAtIndex(val, index, arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
