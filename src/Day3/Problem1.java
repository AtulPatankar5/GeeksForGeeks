package Day3;

public class Problem1 {
// Absolute of number
	public static int absolute(int n) {
		if (n < 0)
			return -1 * n;
		else
			return n;
	}

	public static void main(String[] args) {

		int n = -10;
		int result = absolute(n);
		System.out.println(result);
	}

}
