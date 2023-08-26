package Day2;

public class PrimeNumber_Optimized {
	public static boolean isPrime(int a) {
		int count = 0;
		if (a == 1)
			return false;
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0)
				return false;
			System.out.println(++count);
		}
		return true;
	}

	public static void main(String[] args) {
		int a = 17;
		System.out.println("Prime Number " + isPrime(a));
	}
}
