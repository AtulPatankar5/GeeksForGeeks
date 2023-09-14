package Day12;

public class Panagram {

	public static boolean isPanagram(String str) {

		str = str.toLowerCase();
		if (str.length() < 26)
			return false;
		for (char i = 'a'; i <= 'z'; i++) {
			int index = str.indexOf(i);
			if (index == -1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Quick brown fox jumps over the lazy dog";
//		String str = "hello";
		boolean result = isPanagram(str);
		System.out.println(result);
	}

}
