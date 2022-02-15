package com.akm.algo;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum$1(new int[] { 0, 4, 3, 0 }, 0)));
	}

	public static int[] twoSum$1(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}

		}
		return new int[] {};
	}

	// for this we need a non decreasing sorted order array.
	public static int[] twoSum$2(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		int sum;
		while (left < right) {
			sum = nums[left] + nums[right];
			if (sum == target)
				return new int[] { left, right };

			if (sum > target)
				right--;
			else
				left++;

			System.out.println(left + "," + right + " : " + sum);

		}
		return new int[] { -1, -1 };
	}
}
