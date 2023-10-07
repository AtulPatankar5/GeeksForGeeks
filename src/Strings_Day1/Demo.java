package Strings_Day1;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.length());
		char[] c = { 'a', 'b' };
		System.out.println(c);
		String str2 = "Welcome";
		String str3 = str + str2;
		System.out.println(str3);
		System.out.println(str3.substring(2, 4));
		;
		System.out.println(str3);
		ArrayList<Character> ch = new ArrayList<>();
		ch.add('a');

		String a = "geeks";
		String b = "eeks";
//		b.length();
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);
		String c2 = new String("geeks");
		if (a == b) {
			System.out.println("Same");
		} else {
			System.out.println("not same ");
		}

		if (a == c2)
			System.out.println("Same c");
		else
			System.out.println("not same c");
	}
}
