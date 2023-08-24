package Day1;

public class TrailingZeroInFactorialOptimal {
	//TIme complexity => log n
	public static int countTrailingZero(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + (n / i);
		}
		return res;
	}

	public static void main(String[] args) {
		int num = 10;
		int ans = countTrailingZero(num);
		System.out.println(ans);
	}
}
