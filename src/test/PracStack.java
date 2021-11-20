package test;

import java.util.Stack;

public class PracStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(3);
		stack.push(4);
		while(!stack.isEmpty()) {
			Integer element = stack.pop();
			System.out.println(element);
		}
	}

}
