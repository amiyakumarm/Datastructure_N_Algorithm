package com.akm.algo;

import java.util.Arrays;

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
public class TaskScheduler {
	public static void main(String[] args) {

		char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };
		int target = 2;
		System.out.println(leastInterval(tasks, target));
	}

	public static int leastInterval(char[] tasks, int n) {

		int[] arr_map = new int[26];

		for (int i = 0; i < tasks.length; i++) {
			arr_map[tasks[i] - 'A']++;
		}

		Arrays.sort(arr_map);
		int max_val = arr_map[25] - 1;
		int idle_slots = max_val * n;
		for (int i = 24; i >= 0; i--) {
			if (arr_map[i] == 0)
				break;
			idle_slots -= Math.min(max_val, arr_map[i]);
		}

		System.out.println(idle_slots);
		return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
	}
}
