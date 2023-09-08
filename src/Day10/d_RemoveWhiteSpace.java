package Day10;

public class d_RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "    ja va   is pro gram    ";
		System.out.println(str);
		String trimmedtext = str.trim();
		System.out.println(trimmedtext);// remove before and after text
		
//		String newString = str.replaceAll(" ", "");// OR
		String newString = str.replaceAll("\\s", "");// \\s means single space

		System.out.println(newString);
	}

}
