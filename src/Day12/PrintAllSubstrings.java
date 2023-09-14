package Day12;

public class PrintAllSubstrings {
	public static void pritnall(String str) {
		for (int i = 0; i < str.length(); i++) {
			String result = "";
			for (int j = i; j < str.length(); j++) {
				result = result + str.charAt(j);
				System.out.println(result);
			}
		}
	}

	public static void main(String[] args) {
		String str = "abc";
		pritnall(str);
	}

}
