package Strings_Day1;

public class e_LeftMostRepeatingcharacter {

//	public static int leftmost(String s) {
//		for (int i = 0; i < s.length() - 1; i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s.charAt(i) == s.charAt(j)) {
//					return i;
//				}
//			}
//		}
//		return -1;
//	}

//	public static int leftmost(String s) {
//		int[] arr = new int[26];
//		for (int i = 0; i < s.length(); i++) {
//			arr[s.charAt(i) - 'a']++;
//		}
//		for (int i = 0; i < s.length(); i++) {
//			int val = arr[s.charAt(i)-'a'];
//			if (val > 1)
//				return i;
//		}
//		return -1;
//	}

	public static int leftmost(String s) {

		boolean[] b = new boolean[256];
		int res = -1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (b[s.charAt(i)])
				res = i;
			else
				b[s.charAt(i)] = true;
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "azgbbcc";
		int val = leftmost(s);
		System.out.println("Index is " + val);
	}

}
