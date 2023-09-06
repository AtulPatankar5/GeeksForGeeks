package Day7;

public class a_FrequencyInSorted {

	public static void frequency(int[] arr) {
		int count = 0;
		int start = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == start) {
				count++;
				start = arr[i];
			} else {
				System.out.println(arr[i - 1] + " : " + count);
				count = 1;
				start = arr[i];
			}
			if (i == arr.length - 1) {
				System.out.println(arr[i] + " : " + count);
			}
		}
	}

	public static void main(String[] args) {
//		int[] arr = { 10, 10, 10, 25, 30, 30 };
//		int [] arr= {10,10,10};
//		int [] arr= {10,20,30};
		int [] arr= {40,30,30,30,30};
		frequency(arr);
	}

}
