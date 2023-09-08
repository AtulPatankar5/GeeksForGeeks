package Day9;

public class d_WindowSlidingSUm {
	public static boolean slidingsum(int total, int[] arr) {
		int i = 0;
		int sum = 0;
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum > total)
				break;
		}
		for (int j = 0; j < i; j++) {
			if (sum > total)
				sum = sum - arr[j];
			if (sum == total)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int total = 15;
		boolean result = slidingsum(total, arr);
		System.out.println(result);
	}

}
