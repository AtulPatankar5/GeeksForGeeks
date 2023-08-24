package Day1;

public class HCFOFNumber {
//TimeComplexity = O(min(a,b))
	public static int HCF(int a, int b) {
		int c = Math.min(a, b);
		while (c > 0) {
			if (a % c == 0 && b % c == 0) {
				break;
			}
			c--;
		}
		return c;
	}

	public static void main(String[] args) {

		int a = 7;
		int b = 13;
		int ans = HCF(a, b);
		System.out.println(ans);
	}

}
