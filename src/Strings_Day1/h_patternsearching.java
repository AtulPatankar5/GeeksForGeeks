package Strings_Day1;

public class h_patternsearching {

	public static void pattern(String s1, String s2) {
		int j = 0;
		int size = s2.length();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(j)) {
				j++;
			}
			if (j == size) {
				System.out.println(i - size + 1);
				j = 0;
				i = i - size + 1;
			}
		}
		if(j!=size)
			System.out.println("not found");
	}

	public static void main(String[] args) {
		String s1 = "aaaaa";
		String s2 = "bb";
		pattern(s1, s2);
	}

}
