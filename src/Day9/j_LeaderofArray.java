package Day9;

import java.util.ArrayList;
import java.util.List;

public class j_LeaderofArray {

	public static List<Integer> leader(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int leader=arr[arr.length-1];
		list.add(arr[arr.length-1]);
		for( int i=arr.length-2;i>=0;i--) {
			if(arr[i]>leader) {
				leader=arr[i];
				list.add(arr[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		// Output: 17 5 2
		List<Integer> result = leader(arr);
		System.out.println(result);
	}

}
