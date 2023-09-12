package Day12;

public class WordsCountofString {
//HELLO WORLD => 
//	HELLO --> 5
//	WORLD --> 5
	public static void wordCount(String str) {

		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				count = 0;
				System.out.println();
			} else {
				System.out.print(arr[i]);
				count++;
			}
			if( i+1<arr.length && arr[i+1]==' '   || i==arr.length-1 ) {
				System.out.println( " "+ count);
			}
		}

	}

	public static void main(String[] args) {

		String str = "HELLO WORLD IN a Country like INdia";
		wordCount(str);
	}

}
