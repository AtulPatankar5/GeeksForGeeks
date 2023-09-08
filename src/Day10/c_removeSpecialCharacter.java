package Day10;

public class c_removeSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "$ja^v&as$t%ar";
		String newtext=str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(newtext);
	}

}
