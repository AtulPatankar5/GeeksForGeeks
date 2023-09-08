package Day10;

import java.util.Arrays;

public class g_replaceCharacterwithOccurance {

	public static void main(String[] args) {
		// Approach 1
		String str = "OPENTEXTTT";
		char[] arr = str.toCharArray();
		char word = 'T';
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (word == arr[i]) {
				arr[i] = String.valueOf(count).charAt(0);
//				(char) (count++ + 49);
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));

		// Approach 2--Replace
		String bottle = "BOTTLE";
		int count2 = 1;
		for (int i = 0; i < bottle.length(); i++) {
			char ch = bottle.charAt(i);
			if (word == ch) {
				bottle = bottle.replaceFirst(String.valueOf(word), String.valueOf(count2++));
			}
		}
		System.out.println(bottle);

	}

}
