package Day1;

public class PallidromeNumber {

	public static boolean isPallidrome(int num) {
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int newNum = temp % 10;
			sum = sum * 10 + newNum;
			temp = temp / 10;
		}
		return sum == num;
	}

	public static void main(String[] args) {

		int num = 32123;
		boolean pallidrome = isPallidrome(num);
		System.out.println("Pallindrome " + pallidrome);
	}

}
