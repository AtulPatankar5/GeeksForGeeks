package Day5;

public class b_Second_Largest_Element {

	public static void findFirstandSecondMax(int[] arr) {

		int largest = 0;
		int secondLargest = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				secondLargest = largest;
				largest = i;
			} else if (arr[i] != arr[largest]) {
				if (secondLargest == -1 || arr[i] > arr[secondLargest])
					secondLargest = i;
			}
		}
		System.out.println("Largest=" + arr[largest]);
		System.out.println("2nd Largest=" + arr[secondLargest]);

	}

	public static void main(String[] args) {
//		int[] arr = { 10, 5, 8, 20 };
		int[] arr = { 20, 10, 20, 8, 17 };
//		int[] arr = { 10, 10, 10 };
		findFirstandSecondMax(arr);
	}

}
