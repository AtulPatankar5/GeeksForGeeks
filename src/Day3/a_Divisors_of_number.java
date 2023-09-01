package Day3;

import java.util.ArrayList;
import java.util.List;

public class a_Divisors_of_number {
//TIme Complexity= sqrt (n)
	public static List<Integer> divisor(int n) {
		List<Integer> list = new ArrayList<>();
		int i;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		for (i=i-1; i >= 1; i--) {
			if (n % i == 0) {
				list.add(n / i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int n = 20;
		List<Integer> answer = divisor(n);
		System.out.println(answer);
	}

}
