package Day7;

public class c_RainWater {

	public static int raincollect(int[] arr) {

		int sum = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			int current = arr[i];
			int leftmax = 0, rightmax = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > current)
					leftmax = arr[j];
			}
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] > current)
					rightmax = arr[k];
			}
			int min = Math.min(leftmax, rightmax);
			if (min > current)
				sum = sum + min - current;
		}
		return sum;
	}

	public static void main(String[] args) {

//		int[] arr = { 3, 0,1, 2, 5 };
//		int [] arr= {2,0,2};
//		int[] arr = { 3, 2, 1 };
//		int[] arr = { 1, 2, 3 };
//		int [] arr= {1,2,1,3,1,2,1};
		int [] arr= {3,5,2,3};
		int sum = raincollect(arr);
		System.out.println(sum);
	}

}
