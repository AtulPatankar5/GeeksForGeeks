package Day3;

public class Problem3 {
//Quadratic equation

	public static void calculateQuadratic(int a, int b, int c) {
		double product = b * b - 4 * a * c;// 4-4*1*1=0
		if (product >= 0) {
			int  result1 =(int ) (-b + Math.sqrt(product)) / (2 * a );//2+sqrt(0)/2
			int result2 = (int )(-b - Math.sqrt(product)) / (2 * a );//2-sqrt(0)/2

			System.out.println(result1 + " " + result2);
		} else {
			System.out.println("roots are imaginary");
		}
	}

	public static void main(String[] args) {

		int a = 1;
		int b = -2;
		int c = 1;
		calculateQuadratic(a, b, c);
	}

}
