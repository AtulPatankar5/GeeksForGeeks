package Day10;

import java.util.HashSet;
import java.util.Set;

public class e_RemoveDuplicates {

	public static void main(String[] args) {

		String str = "programming";

		// Approach 1
		StringBuilder builder = new StringBuilder();
		str.chars().distinct().forEach(s -> builder.append((char) s));
		System.out.println(builder);

		// Approach 2
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char start = str.charAt(i);
			int val = str.indexOf(start, i + 1);
			if (val == -1) {
				build.append(start);
			}
		}
		System.out.println(build);

		// Approach 3
		char[] arr = str.toCharArray();
		StringBuilder build2 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
				// Programming
			}
			if (flag == false)
				build2.append(arr[i]);
//				System.out.println(arr[i]);
		}
		System.out.println(build2);

		
		// Approach 4
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(char c:set)
			sb4.append(c);
		System.out.println(sb4);
	}

}
