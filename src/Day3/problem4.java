package Day3;

public class problem4 {
// Factorial of Number

	public static long factorial(int num) {
		if (num == 0)
			return 1;
		return num * factorial(num - 1);
	}

	public static int counter(int n) {

		long result = factorial(n);
		System.out.println(result);
		int count = 0;
		while (result != 0) {
			result = result / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 10;
		int result = counter(n);
		System.out.println(result);
	}

}
