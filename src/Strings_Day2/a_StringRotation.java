package Strings_Day2;

public class a_StringRotation {

//	public static boolean rotation(String s1, String s2) {
//		if (s1.length() != s2.length()) {
//			return false;
//		}
//		char[] arr2 = s2.toCharArray();
//		for (int i = 0; i < s1.length(); i++) {
//			char temp = arr2[0];
//			for (int j = 1; j < arr2.length; j++) {
//				arr2[j - 1] = arr2[j];
//			}
//			arr2[arr2.length - 1] = temp;
//			String str2 = new String(arr2);
//			if (str2.equals(s1))
//				return true;
//		}
//
//		return false;
//	}

	public static boolean rotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		String s3 = s1 + s1;
		int i=0;
		int count = 0;
		for (int j = 0; j < s3.length(); j++) {
			if (s2.charAt(i) == s3.charAt(j)) {
				i++;
				count++;
			}
			if (count == s2.length())
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCA";
		String s2 = "BCAA";
		boolean result = rotation(s1, s2);
		System.out.println(result);
	}

}
