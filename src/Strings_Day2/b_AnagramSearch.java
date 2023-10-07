package Strings_Day2;

public class b_AnagramSearch {

	private static boolean anagramSearch(String s1, String s2) {

		for (int i = 0; i <= (s1.length() - s2.length()); i++) {
			if (anagram(i, s2.length() - 1 + i, s1, s2))
				return true;
		}
		return false;
	}

	private static boolean anagram(int start, int end, String s1, String s2) {
		int ch[] = new int[256];
		int count = 0;
		for (int i = start; i <= end; i++) {// addition of data
			ch[s1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length(); i++) {
			int val = ch[s2.charAt(i) - 'a'];
			if (val > 0) {
				count++;
				val--;
			}
		}
		return count == s2.length();
	}

	public static void main(String[] args) {
		String s1 = "geeksforgeeks";
		String s2 = "seek";
		boolean result = anagramSearch(s1, s2);
		System.out.println(result);
	}
}
