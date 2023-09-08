package Day10;

public class b_PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ATUL";
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j <= i; j++) {
				char result = name.charAt(j);
				System.out.print(result);
			}
			System.out.println();
		}
	}
}
