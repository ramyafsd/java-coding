package com.tclabs.dao;

import java.util.Arrays;

public class ArrayOperations {

	public void printElements(int[] arr) {
		System.out.println("Elements in the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	public void sortArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Sorted Array is:");
		for(Object item: arr) {
			System.out.println(item);
		}
	}
}
