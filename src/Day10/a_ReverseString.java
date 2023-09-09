package Day10;

import java.util.Arrays;

public class a_ReverseString {

	public static void main(String[] args) {

		// Approach 1
		String str = "HELLO";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));

		}

		// Approach 2
		System.out.println();
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

		// Approach 3
		StringBuffer stbf = new StringBuffer(str);
		System.out.print(stbf.reverse());
		System.out.println();

		// Approach 4
		StringBuilder stbl = new StringBuilder(str);
		System.out.println(stbl.reverse());

		String rock = "ROCKIEE";
		char[] arr2 = rock.toCharArray();
		for (int i = 0; i < arr2.length/2; i++) {
			char temp = arr2[i];
			arr2[i] = arr2[arr2.length - 1 - i];
			arr2[arr2.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
