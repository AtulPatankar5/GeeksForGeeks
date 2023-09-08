package Day10;

public class Program1 {
	public static void main(String[] args) {
		String str="AABAACAADAABAABA";
		String find="AABA";
		boolean contains =false;
		for( int i=0;i<str.length();i++) {
			contains = str.contains(find);
			
		}
		System.out.println(contains);
	}

}
