package com.akm.algo;

import java.util.Arrays;

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
