package Day11;

public class i_reverseWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Welcome to India";
		String [] arr=word.split(" ");
		
		for( int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] +" ");
		}
	}

}
