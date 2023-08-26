package Day2;

import java.util.ArrayList;
import java.util.List;

// Time COmplexity ==> O( sqrroot(n))
public class PrimeFactorsOptimized2 {
//TIme complexity => O(n Logn )
	public static List<Integer> PrimeFactors(int num) {
		List<Integer> list = new ArrayList<>();

		if (num <= 1)
			return null;
		while (num % 2 == 0) {
			list.add(2);
			num = num / 2;
		}
		while (num % 3 == 0) {
			list.add(3);
			num = num / 3;
		}
		for (int i = 5; i * i <= num; i = i + 6) {
			while (num % i == 0) {
				list.add(i);
				num = num / i;
			}
			while (num % (i + 2) == 0) {
				list.add(i);
				num = num / i;
			}
		}
		if (num > 3)
			list.add(num);
		return list;
	}

	public static void main(String[] args) {
		int num = 450;
		List<Integer> primeFactors = PrimeFactors(num);
		System.out.println(primeFactors);
	}

}
