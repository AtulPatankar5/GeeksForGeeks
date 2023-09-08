package Day10;

public class a_ReverseString {

	public static void main(String[] args) {

		//Approach 1
		String str = "HELLO";
		for( int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));

		}
		
		//Approach 2
		System.out.println();
		char[] arr=str.toCharArray();
		for( int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

		//Approach 3
		StringBuffer stbf=new StringBuffer(str);
		System.out.print(stbf.reverse());
		System.out.println();
		
		//Approach 4
		StringBuilder stbl=new StringBuilder(str);
		System.out.println(stbl.reverse());
	
	}

}
