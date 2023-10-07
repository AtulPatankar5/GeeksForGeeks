package Strings_Day1;

public class g_ReverseTheWords {

	public static void reverse(int start, int end, char[] arr) {
		for (int i = 0; i < (end - start) / 2; i++) {
			char temp = arr[start+i];
			arr[start+i] = arr[end - i];
			arr[end- i] = temp;
		}
	}

	public static char[] reverseString(String str) {
		char[] arr = str.toCharArray();
		int start = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				reverse(start, i - 1, arr);
				start = i + 1;
			}
		}
		reverse(start, arr.length - 1, arr);
		reverse(0, arr.length - 1, arr);
		return arr;

	}

	public static void main(String[] args) {
		String str = "abc def ghi";
		char[] arr = reverseString(str);
		String newString=new String(arr);
		System.out.println(newString);
//		System.out.println(Arrays.toString(arr));
	}

}
