package Day12;

import java.util.Arrays;

public class ReverseString {
	public static char [] revereseString(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}


	public static void main(String[] args) {
		String str = "JAVA";
		char result1[]=revereseString(str);
	}

}
