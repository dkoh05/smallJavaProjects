package test;

import java.util.*;

public class BaseballGame {
	static int calcPoints(String[] ops){
	    Stack<Integer> stack = new Stack<>();
	    int sum = 0;
	    for(String s : ops) {
	        if(s == "+") {
	            int topValue = stack.pop();
	            int total = topValue + (stack.peek()); // add the popped value with the current top value in the stack tgt
	            sum = sum + total;
	            stack.push(topValue);
	            stack.push(total);
	        } else if (s == "C") {
	            int popValue = stack.pop();
	            sum = sum - popValue;
	        } else if (s == "D") {
	            int temp = stack.peek() * 2; // top element in stack multiplied by 2
	            sum = sum + temp;
	            stack.push(temp);
	        } else {
	            int num = stack.push(Integer.parseInt(s));
	            sum = sum + num;
	        }

	    }
	    return sum;

	}

	public static void main(String[] args) {
		String[] ops = new String[] {"5","-2","4","C","D","9","+","+"};
		int output = calcPoints(ops);
		System.out.println(output);

	}

}
