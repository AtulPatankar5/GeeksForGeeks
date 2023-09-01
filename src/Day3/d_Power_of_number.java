package Day3;

public class d_Power_of_number {

	public static int pow(int a, int b) {
		int mult = 1;
		while (b > 0) {
			mult = mult * a;
			b--;
		}
		return mult;
	}

	public static int power(int a, int b) {

		if (b % 2 == 0) {
			return pow(a, b / 2) * pow(a, b / 2);
		} else {
			return pow(a, b - 1) * a;
		}
	}

	public static void main(String[] args) {

		int a = 2;
		int b = 1;
		int result = power(a, b);
		System.out.println(result);
	}

}
