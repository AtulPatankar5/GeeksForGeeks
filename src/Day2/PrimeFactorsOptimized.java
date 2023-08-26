package Day2;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsOptimized {
//TIme complexity => O(n Logn )
	public static List<Integer> PrimeFactors(int num) {
		List<Integer> list = new ArrayList<>();
		if (num <= 1)
			return null;
		for (int i = 2; i * i <= num; i++) {
			while (num % i == 0) {
				list.add(i);
				num = num / i;
			}
		}
		if (num > 1)
			list.add(num);
		return list;
	}

	public static void main(String[] args) {
		int num = 84;
		List<Integer> primeFactors = PrimeFactors(num);
		System.out.println(primeFactors);
	}

}
