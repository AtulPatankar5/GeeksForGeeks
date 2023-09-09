package Day11;

public class h_AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "3115";
		String str2 = "2223";
		String str3 = "";
		int val1=Integer.parseInt(str1);
		int val2=Integer.parseInt(str2);
		System.out.println(val1+val2);
		
		for (int i = 0; i < str1.length(); i++) {
			int value1 = str1.charAt(i);
			int value2 = str2.charAt(i);
// 			int value1 = Integer.parseInt(String.valueOf(str1.charAt(i)));
//			int value2 = Integer.parseInt(String.valueOf(str2.charAt(i)));
//			System.out.println(value1);
//			System.out.println(value2);
			char value3 =(char) (value1 + value2-48 );
//			System.out.println(value3);
			str3 = str3 + value3;
		}
		System.out.println(str3);

	}

}
