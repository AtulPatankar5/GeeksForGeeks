package Day5;

class d_CheckSorted {

	public static boolean checkSorted(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 6, 8, 9 };
//		int [] arr= {2,10,10,15};
//		int [] arr= {100};
//		int [] arr= {100,20,200};
		boolean result = checkSorted(arr);
		System.out.println(result);
	}
}
