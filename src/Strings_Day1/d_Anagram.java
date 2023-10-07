package Strings_Day1;

public class d_Anagram {

	public static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int count = 0;
		int[] arr = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char start = s2.charAt(i);
			int val = arr[start - 'a'];
			if (val > 0) {
				count++;
				val--;
			}
		}
		return count == s1.length();
	}

	public static void main(String[] args) {

		String s1 = "paple";
		String s2 = "akple";
		boolean result = anagram(s1, s2);
		System.out.println(result);
	}

}
