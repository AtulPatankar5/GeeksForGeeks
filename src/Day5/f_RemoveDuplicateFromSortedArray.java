package Day5;

public class f_RemoveDuplicateFromSortedArray {

	public static int removeDuplicate(int[] arr) {
		int size = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1])
				arr[size++] = arr[i + 1];
		}
		return size;

	}

	public static void main(String[] args) {

		int[] arr = { 10,10, 20, 20	, 30, 30, 50, 70 };// 10,20,30,_,_,_,_
//		int[] arr = { 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 20 };
		int size = removeDuplicate(arr);
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

}
