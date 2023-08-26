package Day2;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
//TIme complexity => O(n Logn )
	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 2; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}

	public static List<Integer> PrimeFactors(int num) {
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				while (num % i == 0) {
					list.add(i);
					num = num / i;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int num = 40;
		List<Integer> primeFactors = PrimeFactors(num);
		System.out.println(primeFactors);
	}

}
