package Day3;

public class e_Iterative_Power {

	public static void main(String[] args) {

		int n = 10;
		while (n > 0) {
			if (n % 2 != 0) {
				System.out.print(1+" ");
			} else
				System.out.print(0+" ");
			n=n/2;
		}
	}
}
