package com.tclabs.dao;

import java.util.HashMap;

public class ArthematicOperations {
	public double addTwonumbers(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	public double largestOfThree(double num1, double num2, double num3) {
		double biggest = num1;
		if (biggest < num2 && num2 > num3) {
			biggest = num2;
		} else if (biggest < num3) {
			biggest = num3;
		}
		return biggest;
	}

	public HashMap<Integer, Integer> arrayElementscount(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				Integer prevCount = map.get(arr[i]);
				map.put(arr[i], ++prevCount);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}
	public void sortIntArray(int[] arr) {
		for(int i =0;i< arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp =0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
