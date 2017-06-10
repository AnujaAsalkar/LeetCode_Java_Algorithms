package com.stack;

import java.util.Stack;

public class EvaluatePostfixExp {

	public static int eval(String postfix) {
		int result = 0, operand1, operand2, temp = 0;
		Stack<Integer> operands = new Stack<Integer>();
		for (int i = 0; i < postfix.length(); i++) {
			if (postfix.charAt(i) == '+') {
				operand2 = operands.pop();
				operand1 = operands.pop();
				result = operand1 + operand2;
				operands.push(result);

			} else if (postfix.charAt(i) == '-') {
				operand2 = operands.pop();
				operand1 = operands.pop();
				result = operand1 - operand2;
				operands.push(result);

			} else if (postfix.charAt(i) == '*') {
				operand2 = operands.pop();
				operand1 = operands.pop();
				result = operand1 * operand2;
				operands.push(result);

			} else if (postfix.charAt(i) == '/') {
				operand2 = operands.pop();
				operand1 = operands.pop();
				result = operand1 / operand2;
				operands.push(result);

			} else {
				temp = Character.getNumericValue(postfix.charAt(i));
				operands.push(temp);
			}
		}

		return operands.pop();
	}

	public static void main(String[] args) {
		String postfix = "23*5+2-";
		int ans = eval(postfix);
		System.out.println(ans);
	}

}
