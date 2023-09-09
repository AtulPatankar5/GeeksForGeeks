package Day11;

import java.util.Arrays;

public class b_reverseEachWordOfString {

	public static void reverseWord(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String start = words[i];
			char[] letterArr = start.toCharArray();
			for (int j = 0; j < letterArr.length / 2; j++) {
				char temp = letterArr[j];
				letterArr[j] = letterArr[letterArr.length - j - 1];
				letterArr[letterArr.length - j - 1] = temp;
			}
//			System.out.println(Arrays.toString(letterArr));
			System.out.print(letterArr);
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JAVA CODE";
		reverseWord(str);
	}

}
