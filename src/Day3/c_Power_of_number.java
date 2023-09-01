package Day3;

public class c_Power_of_number {

	public static int power(int a, int b) {

		int mult = 1;
		while (b > 0) {
			mult = a * mult;
			b--;
		}
		return mult;
	}

	public static void main(String[] args) {

		int a = 2;
		int b = 4;
		int result = power(a, b);
		System.out.println(result);
	}

}
