package com.akm.algo;

/**
 * 
 * @author amiyakumar.m
 *         <p>
 *         Given a characters array tasks, representing the tasks a CPU needs to
 *         do, where each letter represents a different task. Tasks could be
 *         done in any order. Each task is done in one unit of time. For each
 *         unit of time, the CPU could complete either one task or just be idle.
 * 
 *         However, there is a non-negative integer n that represents the
 *         cooldown period between two same tasks (the same letter in the
 *         array), that is that there must be at least n units of time between
 *         any two same tasks.
 * 
 *         Return the least number of units of times that the CPU will take to
 *         finish all the given tasks.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: tasks = ["A","A","A","B","B","B"], n = 2 Output: 8
 *         Explanation: A -> B -> idle -> A -> B -> idle -> A -> B There is at
 *         least 2 units of time between any two same tasks. Example 2:
 * 
 *         Input: tasks = ["A","A","A","B","B","B"], n = 0 Output: 6
 *         Explanation: On this case any permutation of size 6 would work since
 *         n = 0. ["A","A","A","B","B","B"] ["A","B","A","B","A","B"]
 *         ["B","B","B","A","A","A"] ... And so on. Example 3:
 * 
 *         Input: tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n =
 *         2 Output: 16 Explanation: One possible solution is A -> B -> C -> A
 *         -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle ->
 *         A
 * 
 * 
 *         Constraints:
 * 
 *         1 <= task.length <= 104 tasks[i] is upper-case English letter. The
 *         integer n is in the range [0, 100].
 *         </p>
 */
public class TappingRainWater {
	public static void main(String[] args) {
		System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
	}

	public static int trap(int[] height) {
		int result = 0;

		for (int i = 1; i < height.length - 1; i++) {
			int left = height[i];

			for (int j = 0; j < i; j++) {
				left = Math.max(height[j], left);
			}

			int right = height[i];

			for (int j = i + 1; j < height.length; j++) {
				right = Math.max(height[j], right);
			}
			result += Math.min(left, right) - height[i];
		}
		return result;
	}
}