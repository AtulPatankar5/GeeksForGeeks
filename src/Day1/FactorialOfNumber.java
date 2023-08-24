package Day1;

public class FactorialOfNumber {

	public static int factorial(int num) {
		if (num == 0)
			return 1;
		return num * factorial(--num);
	}

	public static void main(String[] args) {
		int num = 5;
		int answer = factorial(num);
		System.out.println(answer);
	}
}
