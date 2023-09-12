package Day12;

public class PallindromeString {

	public static String reverseString(String str1) {
		char[] arr = str1.toCharArray();
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i];
		}
		return result;

	}

	public static boolean palindromeCheck(String str1) {
		String reverse = reverseString(str1);
		if (reverse.equals(str1))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "AAJAA";
		boolean result = palindromeCheck(str1);
		System.out.println("Pallindrome=" + result);
	}

}
