package Day3;

public class Problem5 {
//	Given first term (a), common ratio (r), and an integer N of the Geometric Progression series,
//	the task is to find the Nth term of the series.
	public static int calculateNthTerm(int a, int r, int n) {
		int result = a;
		while (n > 0) {
			result = result * r;
			n--;
		}
		return result;
	}

	public static void main(String[] args) {
		int a = 2;
		int r = 3;
		int n = 5;
		int result = calculateNthTerm(a, r, n-1);
		System.out.println(result);
	}
}
