package Day3;

public class Problem2 {
// calculat fahreinhiet from celsius

	public static int calculateTemp(double cel) {
		double val = (9.0 / 5) * cel;
		System.out.println(val);
		return (int) val + 32;
	}

	public static void main(String[] args) {

		double cel = 32;
		int result = calculateTemp(cel);
		System.out.println(result);
	}

}
