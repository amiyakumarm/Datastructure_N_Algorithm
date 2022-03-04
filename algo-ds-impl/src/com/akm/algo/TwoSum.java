package com.akm.algo;

import java.util.Arrays;

/**
 * 
 * @author amiyakumar.m Given an array of integers nums and an integer target,
 *         return indices of the two numbers such that they add up to target.
 * 
 *         You may assume that each input would have exactly one solution, and
 *         you may not use the same element twice.
 * 
 *         You can return the answer in any order.
 * 
 *         Example 1:
 * 
 *         Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
 *         Because nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
 * 
 *         Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
 * 
 *         Input: nums = [3,3], target = 6 Output: [0,1]
 * 
 *         Constraints:
 * 
 *         2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <= 109
 *         Only one valid answer exists.
 * 
 *         Follow-up: Can you come up with an algorithm that is less than O(n2)
 *         time complexity?
 */

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
