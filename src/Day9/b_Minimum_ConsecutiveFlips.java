package Day9;

public class b_Minimum_ConsecutiveFlips {

	public static void minimumFLips(int[] arr) {
		int start = arr[0];
		int startindex =0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == start && arr[i] != start) {
				startindex = i;
			}
			if (arr[i] != start)
				continue;
			if (arr[i] == start && arr[i - 1] != start) {
				int endindex = i - 1;
				System.out.println(startindex + " to " + endindex);
			}
		}
	}

	public static void main(String[] args) {
//		int[] arr = { 1,1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1 };
//		int arr[]= {1,1,1};
int []arr= {0,1};
		minimumFLips(arr);
	}

}
