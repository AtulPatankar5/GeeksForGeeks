package Strings_Day1;

public class c_SubsStringSequence {
//
//	public static boolean subString(String str1, String str2) {
//		boolean flag = false;
//		int begin = 0;
//		char[] arr1 = str1.toCharArray();
//		for (int i = 0; i < str2.length(); i++) {
//			char start = str2.charAt(i);
//			int check = 0;
//			for (int j = begin; j < str1.length(); j++) {
//				if (start == arr1[j]) {
//					flag = true;
//					begin = j + 1;
//					check = 1;
//					break;
//				} else {
//					flag = false;
//				}
//			}
//			if (check == 0) {
//				flag = false;
//			}
//		}
//		return flag;
//	}

	public static boolean subString(String str1, String str2) {
		if (str1.length() < str2.length())
			return false;
		
		int j = 0;
//		char[] arr1 = str1.toCharArray();
//		char[] arr2 = str2.toCharArray();
		for (int i = 0; i < str1.length() && j < str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
		}
		return j == str2.length();
	}

	public static void main(String[] args) {
		String str1 = "ABCDE";
		String str2 = "AD";
		boolean result = subString(str1, str2);
		System.out.println(result);
	}
}
