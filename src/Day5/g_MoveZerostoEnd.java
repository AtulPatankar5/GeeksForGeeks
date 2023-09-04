package Day5;

public class g_MoveZerostoEnd {
//	public static int[] moveZeros(int[] arr) {
//		int[] temp = new int[arr.length];
//		int j = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0)
//				temp[j++] = arr[i];
//		}
//		return temp;
//	}

//	}

	public static void moveZeros(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j++] = temp;
			}
		}
	}

	public static void main(String[] args) {
//		int arr[] = { 10, 0, 0, 20, 0, 0, 30, 0 };
//		int []arr= {0,0,0,0,10,20,30};
		int[] arr = { 10, 20, 30, 0, 0 };
		moveZeros(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
