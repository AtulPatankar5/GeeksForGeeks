package Day3;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
//Given a positive integer value N. The task is to find how many numbers less than or equal to N 
//	have numbers of divisors exactly equal to 3.
	public static List<Integer> calculateThreeDivisors(int n) {

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 3)
				list.add(i);
		}
		return list;
	}

	public static void main(String[] args) {

		int n = 10;
		List<Integer> list = calculateThreeDivisors(n);
		System.out.println(list);
	}
}
