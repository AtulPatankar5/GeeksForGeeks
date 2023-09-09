package Day11;

import java.util.Stack;

public class g_StringisWellFormedorNot {

	public static void main(String[] args) {

		String str = "{[()]}";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (stack.isEmpty()) {
				stack.push(letter);
			} else if (letter == '[' || letter == '(' || letter == '{') {
				stack.push(letter);
			} else if (letter == ']' || letter == ')' || letter == '}') {
				stack.pop();
			}
		}
		if (stack.isEmpty())
			System.out.println("String is well formed ");
		else
			System.out.println("Not formed");
	}

}
