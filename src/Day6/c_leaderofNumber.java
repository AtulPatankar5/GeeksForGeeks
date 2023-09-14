package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class c_leaderofNumber {

//	public static List<Integer> leader(int[] arr) {
//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			boolean flag = true;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] <= arr[j]) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag == true)
//				list.add(arr[i]);
//		}
//		return list;
//	}

//	public static List<Integer> leader(int[] arr) {
	public static int[] leader(int[] arr) {

		List<Integer> list = new ArrayList<>();
		int leader = arr[arr.length - 1];
		list.add(leader);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				list.add(arr[i]);
				leader = arr[i];
			}
		}
		int sizeofNewArray = list.size();
		int arr2[] = new int[sizeofNewArray];
		for (int i = sizeofNewArray-1; i >=0; i--) {
			arr2[i] = list.get(i);
		}

//		Collections.sort(list,(a,b)->b.compareTo(a));
		return arr2;
	}

	public static void main(String[] args) {

		int[] arr = { 7, 10, 4, 3, 6, 5, 2 };
//		int [] arr= {2};
//		int[] arr = { 30, 20, 10 };
//		List<Integer> list = leader(arr);
		int[] newArray = leader(arr);
//		System.out.println(list);
		System.out.println(Arrays.toString(newArray));
	}

}
