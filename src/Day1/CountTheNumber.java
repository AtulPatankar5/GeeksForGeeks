package Day1;

public class CountTheNumber {

	public static int countNumbers(int n) {
		if (n == 0)
			return 0;
		return 1 + countNumbers(n / 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
//		int count=0;
//		while(n>0) {
//			n=n/10;
//			count++;
//		}
		int count = countNumbers(n);
		System.out.println("Count is " + count);

	}

}
