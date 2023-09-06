package Day7;

public class d_CountOne {

	public static int countOne(int[] arr) {
		int count = 0;
		int val = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				if (count > val)
					val = count;
			} else {
				count = 0;
			}
		}
		return val;
	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 0, 1, 0, 1, 1, 1 };
		int result = countOne(arr);
		System.out.println(result);
	}

}
