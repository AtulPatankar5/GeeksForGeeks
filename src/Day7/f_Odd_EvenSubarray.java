package Day7;

public class f_Odd_EvenSubarray {

	public static int evenOddSubarray(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i] % 2 == 0 && arr[i + 1]%2 != 0) || (arr[i] % 2 != 0 && arr[i + 1]%2 == 0)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 12, 14, 7, 8 };
//		int[] arr = { 7,10,13,14};
//		int [] arr= {10,12,14,18};
		
		System.out.println(evenOddSubarray(arr));
	}

}
