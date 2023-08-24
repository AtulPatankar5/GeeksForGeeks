package Day1;

public class TrailingZeroInFactorial {

	public static long factorialNumber(long num) {
		if (num == 0)
			return 1;

		return num * factorialNumber(--num);
	}

	public static long countZero(long ans) {
		int count = 0;
		while (ans != 0) {
			long zero = ans % 10;
			if (zero == 0) {
				count++;
			}
			if(zero!=0)
				break;
			ans = ans / 10;
		}
		return count;
	}

	public static void main(String[] args) {

		long num = 17;
		long ans = factorialNumber(num);
		long count = countZero(ans);
		System.out.println("Factorial=" + ans);
		System.out.println("Count is=" + count);
	}

}
