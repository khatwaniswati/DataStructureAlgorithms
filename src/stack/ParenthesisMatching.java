package stack;

import java.util.Stack;

public class ParenthesisMatching {

	public static void main(String[] args) {
		String s = "()([])";
		boolean isParenthesisMatching = isParenthesisMatching(s);
		System.out.println("isParenthesisMatching: " + isParenthesisMatching);

		s = "))((";
		isParenthesisMatching = isParenthesisMatching(s);
		System.out.println("isParenthesisMatching: " + isParenthesisMatching);

		s = "(]";
		isParenthesisMatching = isParenthesisMatching(s);
		System.out.println("isParenthesisMatching: " + isParenthesisMatching);
	}

	private static boolean isParenthesisMatching(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isOpening(c))
				stack.push(c);
			else {
				if (stack.isEmpty())
					return false;
				else if (!isMatching(stack.peek(), c)) {
					return false;
				} else
					stack.pop();
			}
		}
		return stack.isEmpty();
	}

	private static boolean isOpening(char c) {
		return c == '(' || c == '{' || c == '[';
	}

	private static boolean isMatching(char start, char end) {
		return (start == '(' && end == ')') || (start == '{' && end == '}') || (start == '[' && end == ']');
	}

}
