package Day12;

public class LongestNonRepetativeSubstring {
	public static String longest(String str) {
//		char[] arr = str.toCharArray();
		String temp = "";
		String longestsubarray = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int index = temp.indexOf(c);
			if (index == -1) {
				temp = temp + c;
			} else {
				temp = "";
				temp = temp + c;
			}
			if (temp.length() > longestsubarray.length()) {
				longestsubarray = temp;
			}
		}
		return longestsubarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaadab";
		String result=longest(str);
		System.out.println(result);
	}

}
