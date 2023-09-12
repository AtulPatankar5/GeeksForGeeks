package Day12;

public class AnagramCheckusingStringBuilder {

	public static boolean anagramCheck(String str1, String str2) {
		char[] arr = str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		for (int i = 0; i < arr.length; i++) {
			int index = sb.indexOf(String.valueOf(arr[i]));
			if (index != -1) {
				sb.deleteCharAt(index);
			}
			if(sb.length()==0)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "AAJAVAAA";
		String str2 = "AAAJVAAA";
		boolean result = anagramCheck(str1, str2);
		System.out.println("Anagram="+result);
	}

}
