package Day2;

public class LCM_Optimal {

	public static int HCF(int a, int b) {
		int res = Math.min(a, b);
		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}

	public static int LCM(int a, int b) {
		return (a * b) / HCF(a, b);
	}

	public static void main(String[] args) {

		int a = 4;
		int b = 12;
		System.out.println("LCM is " + LCM(a, b));
	}

}
