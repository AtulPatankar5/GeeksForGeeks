package Day10;

public class PracticeRemvoeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ALLAHABAD";
		char[] arr = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.print(arr[i]);
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			char start = name.charAt(i);
			int index = name.indexOf(start, i + 1);
			if (index == -1) {
				System.out.print(start);
			}
		}
	}
}
