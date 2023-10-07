package Strings_Day1;

public class a_CountCharactersinString {
	public static void countCharacter(String str) {

		int [] ch = new int [26];
		for (int i = 0; i < str.length(); i++) {
			ch[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (ch[i] > 0) {
				System.out.println((char) (i + 'a') + "=" + ch[i]);
			}
		}
		
//		int[] arr = new int[26];
//		for (int i = 0; i < str.length(); i++) {
//			arr[str.charAt(i) - 'a']++;
//		}
//		for (int i = 0; i < 26; i++) {
//			if (arr[i] > 0) {
//				System.out.println((char) (i+'a') +"="+ arr[i]);
//			}
//		}

	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		countCharacter(str);
	}
}

