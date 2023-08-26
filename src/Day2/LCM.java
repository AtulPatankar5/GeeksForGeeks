package Day2;

public class LCM {
	public static int LCM(int a, int b) {
		int c = Math.max(a, b);
		while (true) {
			if (c % a == 0 && c % b == 0)
				return c;
			c++;
		}
	}

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		int result=LCM(a, b);
		System.out.println(result);
	}

}
