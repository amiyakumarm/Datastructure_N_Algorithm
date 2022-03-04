package com.akm.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * @author amiyakumar.m
 *         <p>
 *         20. Valid Parentheses Easy
 * 
 *         11538
 * 
 *         502
 * 
 *         Add to List
 * 
 *         Share Given a string s containing just the characters '(', ')', '{',
 *         '}', '[' and ']', determine if the input string is valid.
 * 
 *         An input string is valid if:
 * 
 *         Open brackets must be closed by the same type of brackets. Open
 *         brackets must be closed in the correct order.
 * 
 * 
 *         Example 1:
 * 
 *         Input: s = "()" Output: true Example 2:
 * 
 *         Input: s = "()[]{}" Output: true Example 3:
 * 
 *         Input: s = "(]" Output: false
 * 
 * 
 *         Constraints:
 * 
 *         1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
 *         </p>
 */
public class ValidParentheses {
	static Map<Character, Character> map = new HashMap<>() {
		private static final long serialVersionUID = 1L;
		{
			put('{', '}');
			put('(', ')');
			put('[', ']');
		}
	};

	public static void main(String[] args) {

		System.out.println(validParentheses("()[]{}["));
		System.out.println(validParentheses("([)]"));
		System.out.println(validParentheses("([])"));
		System.out.println(validParentheses("){"));

	}

	public static boolean validParentheses(String input) {
		if (input == null || input.length() == 1)
			return false;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i)))
				stack.add(input.charAt(i));

			else if (!stack.isEmpty() && map.get(stack.peek()) == input.charAt(i))
				stack.pop();
			else
				return false;

		}

		return stack.isEmpty();

	}
}
