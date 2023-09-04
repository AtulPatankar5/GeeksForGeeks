package Day5;

public class a_Largest_ELement_array {
//Time Complexity= O(n)
	public static int largestElement(int[] arr) {

		int largest = 0;
		if (arr.length == 1)
			return arr[largest];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest])
				largest = i;
		}
		return arr[largest];
	}

	public static void main(String[] args) {

		int[] arr = { -5, -3, -9, -1, -10, 0 };
		int largest = largestElement(arr);
		System.out.println(largest);
	}
}