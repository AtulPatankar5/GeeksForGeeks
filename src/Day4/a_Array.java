package Day4;

public class a_Array {
// insert at specific index

	public static boolean insert(int[] arr, int index, int cap, int value) {
//		if (index == cap)
//			return false;
		for (int i = cap - 1; i >=index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index]=value;
		return true;
		
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 9;
		arr[2] = 2;
		arr[3] = 1;

		int n = 5;
		int value=15;

		boolean result = insert(arr, n - 1, arr.length-1, value);
		System.out.println("added=" + result);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
