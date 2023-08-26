package Day2;

//MOst optimized solution 
public class PrimeNumber_More_Optimized {
	public static boolean isPrime(int a) {
		int count = 0;

		if (a == 1)
			return false;
		if (a == 2 && a == 3)
			return true;
		if (a % 2 == 0 || a % 3 == 0)
			return false;

		for (int i = 5; i * i <= a; i = i + 6) {
			if (a % i == 0 || a % (i + 2) == 0)
				return false;
			System.out.println(++count);
		}
		return true;
	}

	public static void main(String[] args) {
		int a = 1031;
		System.out.println("Prime Number " + isPrime(a));
	}
}
