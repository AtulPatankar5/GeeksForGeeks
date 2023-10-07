package Strings_Day2;

public class c_LongestSubarray {

	public static void main(String[] args) {

		String s1 = "aaaadab";
		String result = longestSubarray(s1);
		System.out.println(result);
		System.out.println(result.length());
	}

	private static String longestSubarray(String s1) {

		String temp = "";
		String subarray = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int val = temp.indexOf(c);
			if (val == -1) {
				temp += c;
			} else {
				temp = "";
				temp += c;
			}
			if (temp.length() > subarray.length()) {
				subarray = temp;

			}
		}
		return subarray;
	}

}
