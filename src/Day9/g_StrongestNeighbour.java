package Day9;

public class g_StrongestNeighbour {

	public static void strongest(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1])
				System.out.println(arr[i]);
			else
				System.out.println(arr[i-1]);
		}
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 2, 3, 4, 5,1 };
		int [] arr= {5,5};
		strongest(arr);
	}

}
