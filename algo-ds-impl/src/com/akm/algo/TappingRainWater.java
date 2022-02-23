package com.akm.algo;

public class TappingRainWater {
	public static void main(String[] args) {
		trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
	}

	public static int trap(int[] height) {
		int result = 0;
		
		for (int i = 1; i < height.length - 1; i++) {
			int left = height[i];
			
			for (int j = 0; j < i; j++) {
				if( height[j] >= left ) {
					
				}
				left = height[j] >= left? height[j]:left;
			}
			 
			int right =  height[i];
			
			for (int j = i+1; j < height.length; j++) {
				right = height[j] >= right? height[j]:right;
			}
			result+= (left>=right?right:left)-height[i];
		}
		return result;
	}
}