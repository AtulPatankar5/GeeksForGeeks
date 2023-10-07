package Strings_Day1;

public class f_LeftMostNonRepeatingCharacter {

	public static int Nonrepeating(String s) {

		int[] arr = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			int val = arr[s.charAt(i) - 'a'];
			if (val == 1) {
				return i;
			}
		}
		return -1;
	}

//	public static int Nonrepeating(String s) {
//
//		boolean[] arr = new boolean[256];
//		int res = -1;
//		for (int i = s.length() - 1; i >= 0; i--) {
//			if (arr[s.charAt(i)]) {
////				res = i;
//			} else {
//				arr[s.charAt(i)] = true;
//				res = i;
//			}
//		}
//		return res;
//	}

	public static void main(String[] args) {
		String s = "abcabc";
		int index = Nonrepeating(s);
		System.out.println("index is " + index);
	}
}
