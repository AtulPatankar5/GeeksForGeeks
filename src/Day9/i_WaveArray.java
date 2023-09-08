package Day9;

import java.util.Arrays;

public class i_WaveArray {
	public static void wave(int[] arr) {
		
		for( int i=0;i<arr.length;i=i+2) {
			if(i==arr.length-1)
				break;
			if(arr[i]<arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	
	}


	public static void main(String[] args) {

		int arr[] = { 2, 4, 7, 8, 9, 10 ,1};
//		Output: 4 2 8 7 10 9
		wave(arr);
		System.out.println(Arrays.toString(arr));
	}
}
