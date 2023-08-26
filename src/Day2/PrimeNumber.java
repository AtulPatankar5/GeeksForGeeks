package Day2;

public class PrimeNumber {
	public static boolean isPrime(int a) {
		if (a == 1)
			return false;
		int count=0;
		for (int i = 2; i  < a; i++) {
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
