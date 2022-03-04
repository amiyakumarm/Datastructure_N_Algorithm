package com.akm.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author amiyakumar.m
 *
 *         Given an array of intervals where intervals[i] = [starti, endi],
 *         merge all overlapping intervals, and return an array of the
 *         non-overlapping intervals that cover all the intervals in the input.
 *         Example 1:
 * 
 *         Input: intervals = [[1,3],[2,6],[8,10],[15,18]] Output:
 *         [[1,6],[8,10],[15,18]] Explanation: Since intervals [1,3] and [2,6]
 *         overlaps, merge them into [1,6]. Example 2:
 * 
 *         Input: intervals = [[1,4],[4,5]] Output: [[1,5]] Explanation:
 *         Intervals [1,4] and [4,5] are considered overlapping.
 * 
 * 
 *         Constraints:
 * 
 *         1 <= intervals.length <= 104 intervals[i].length == 2 0 <= starti <=
 *         endi <= 104
 * 
 */
public class MergeIntervals {
	public static void main(String[] args) {
//		merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } });
		merge(new int[][] { { 1, 4 }, { 5,6}});
	}

	public static int[][] merge(int[][] intervals) {
		if (intervals.length == 1)
			return intervals;
		List<int[]> list = new ArrayList<>();
		int position = 0;
		for (int i = 0; i < intervals.length; i++) {
			for (int j = i + 1; j < intervals.length; j++) {
				if (intervals[i][1] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]) {
					if (list.size() < position) {
						list.add((new int[2]));
					}
					list.get(position)[0] = intervals[i][0];
					list.get(position)[1] = intervals[j][1];
				} else {
					if (list.size() < position) {
						list.add((new int[2]));
					}
					position++; 
					list.get(position)[0] = intervals[j][0];
					list.get(position)[1] = intervals[j][1];
					i = j - 1;
					break;
				}

			}
		}
		int[][] result = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			result[i][0] = list.get(i)[0];
			result[i][1] = list.get(i)[1];
			System.out.print(Arrays.toString(list.get(i)));
		}
		return result;
	}

}
