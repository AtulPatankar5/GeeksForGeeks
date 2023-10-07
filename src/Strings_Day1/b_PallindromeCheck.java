package Strings_Day1;

public class b_PallindromeCheck {

	public static boolean pallindrome(String str) {
		char[] arr = str.toCharArray();
		boolean flag = false;
		for (int i = 0; i <= (str.length() -1)/ 2; i++) {
			if (arr[i] == arr[arr.length - 1 - i]) {
				flag = true;
				continue;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String str = "AMBAMA";
		boolean result = pallindrome(str);
		System.out.println("String is Pallindrome=" + result);
	}
}
