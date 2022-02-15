package com.akm.algo;

import java.util.HashMap;
import java.util.Vector;

public class MinBlockDistance {
	
	public static void main(String[] args) {
		System.out.println();
		Vector<HashMap<String, Boolean>> vector = new Vector<>();
		vector.add(new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put("gym", false);
				put("school", true);
				put("strore", false);
				
			}
		});
		vector.add(new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put("gym", false);
				put("school", true);
				put("strore", false);
				
			}
		});
		vector.add(new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put("gym", false);
				put("school", true);
				put("strore", false);
				
			}
		});
		vector.add(new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put("gym", false);
				put("school", true);
				put("strore", false);
				
			}
		});
		vector.add(new HashMap<>() {
			private static final long serialVersionUID = 1L;
			{
				put("gym", false);
				put("school", true);
				put("strore", false);
				
			}
		});
		
		System.out.println(vector);
	}
}
