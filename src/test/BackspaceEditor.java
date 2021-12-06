package test;

import java.util.*;

public class BackspaceEditor {
	static Stack<Character> calcBs(String s){
		Stack<Character> stack = new Stack();
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c != '#') {
				stack.push(c);
			} else if(!stack.isEmpty()) {
				stack.pop();
			}
		}
		return stack;
	}
	static boolean output(String s, String t) {
		return calcBs(s).equals(calcBs(t));

	}

	public static void main(String[] arg) {
		String s = "a##c", t = "#a#c";
		boolean result = output(s,t);
		System.out.println(result);
	}

}
