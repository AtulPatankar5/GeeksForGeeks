package Day2;

import java.util.ArrayList;
import java.util.List;

public class ListOFPrimeNumbers {
	static int count = 0;

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
//			System.out.println("Count=" + ++count);

		}
		return true;
	}

	public static List<Integer> primeList(int num) {
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= num; i++) {

			if (isPrime(i)) {
				list.add(i);
//				System.out.println("Count=" + ++count);
			}
		}
		return list;
	}

	public static void main(String[] args) {

		int num = 20;
		List<Integer> primeList = primeList(num);
		System.out.println(primeList);
	}

}
