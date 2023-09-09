package Day11;

//
public class d_findSubString {

	public static void main(String[] args) {
		String str = "ALLAHABAD";
		String find = "AHA";
		char[] strArray = str.toCharArray();
		char[] findArray = find.toCharArray();
		int count = 0;
		boolean flag = false;
		int index = 0;
		int size = findArray.length;
		for (int i = 0; i < strArray.length; i++) {
			int ival = i;
			if (findArray[0] == strArray[i]) {
				for (int j = 0; j < findArray.length; j++) {
					if (i < strArray.length && strArray[i++] == findArray[j]) {
						count++;
						if (count == size) {
							index = i - findArray.length;
							flag = true;

						}
					} else {
						count = 0;
						break;
					}
				}
			}
			i = ival;
		}
		System.out.println("String contained " + flag + " \nfrom index= " + index);
	}
}
