package Day7;

public class b_Stock_But_Sell {

	public static int stock(int[] arr) {
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				sum = sum + arr[i] - arr[i - 1];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

//		int[] arr = { 1, 5, 3, 8, 12 };
//		int [] arr= {1,5,3,1,2,8};
//		int [] arr= {10,20,30};
//		int [] arr= {30,20,10};
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int sum = stock(arr);
		System.out.println(sum);
	}

}
