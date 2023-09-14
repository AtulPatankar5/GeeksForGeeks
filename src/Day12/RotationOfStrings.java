package Day12;

public class RotationOfStrings {
	public static boolean rotationcontained(String str, String str3) {

		int count = 0;
		char start = str.charAt(0);
		int index = str3.indexOf(start);
		if (index == -1)
			return false;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == str3.charAt(index++))
				count++;
			else
				return false;
			if (index == str.length())
				index = 0;
			if (count == str.length())
				return true;
		}

		return false;
	}

	public static boolean rotation(String str, String str2) {

		if (str.length() != str2.length())
			return false;

		int count = 0;
		char start = str.charAt(0);
		int index = str2.indexOf(start);
		if (index == -1)
			return false;
		for (int j = 0; j < str2.length(); j++) {
			if (str.charAt(j) == str2.charAt(index++))
				count++;
			if (index == str2.length())
				index = 0;
			if (count == str2.length())
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String str = "abcd";
		String str2 = "abcda";
		String str3 = "abcdabcd";
		boolean result = rotation(str, str2);
		boolean result2 = rotationcontained(str2, str3);
		System.out.println("rotation result" + result);
		System.out.println("Roatation contained=" + result2);
	}

}
