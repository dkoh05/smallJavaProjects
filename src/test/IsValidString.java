package test;

import java.util.Scanner;
import java.util.Stack;

public class IsValidString {
	static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == '(') {
				stack.push(')');
			} else if(s.charAt(i) == '[') {
				stack.push(']');
			} else if(s.charAt(i) == '}') {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
				return false;
			}
		}
		return stack.isEmpty();
	}
	static boolean isValid2(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			else {
				if(stack.empty()) {
					return false;
				}
				char b = stack.pop();
				if (c == ')' && b != '(') {
					return false;
				}
				else if (c == ']' && b != '[') {
					return false;
				}
				else if (c == '}' && b != '{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string of parenthesis: ");
		String s = sc.next();
		sc.close();
		boolean result = isValid2(s);
		System.out.println(result);
		
		
	}
}





