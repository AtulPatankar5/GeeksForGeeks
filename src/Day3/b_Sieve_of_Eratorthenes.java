package Day3;

import java.util.ArrayList;
import java.util.List;

public class b_Sieve_of_Eratorthenes {
//20= 2,3,5,7,13,17,19

	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}

	public static boolean check(int n) {
		boolean flag = true;
		if (isPrime(n))
			return flag;
		return flag = false;
	}

	public static List<Integer> calculatePrimeList(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (check(i) == true) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int n = 20;
		List<Integer> ans = calculatePrimeList(n);
		System.out.println(ans);
	}

}
