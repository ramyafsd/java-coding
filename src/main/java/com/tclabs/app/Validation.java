package com.tclabs.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.tclabs.dao.ArrayOperations;
import com.tclabs.dao.ArthematicOperations;
import com.tclabs.dao.Comparators.IdComparator;
import com.tclabs.dao.Comparators.NameComparator;
import com.tclabs.dto.StudentDto;

public class Validation {

	public static void main(String[] args) {
//		List<StudentDto> list = new ArrayList<StudentDto>();
//		StudentDto s1 = new StudentDto(1, "Ramya", "Banglore");
//		StudentDto s2 = new StudentDto(4, "Jaya", "Banglore");
//		StudentDto s3 = new StudentDto(3, "Kathya", "Banglore");
//		StudentDto s4 = new StudentDto(2, "Harika", "Banglore");
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(s4);
//		int arr[] = { 8, 3, 1, 9, 4 };
//		ArrayOperations arrayOperations = new ArrayOperations();
//		arrayOperations.printElements(arr);
//		arrayOperations.sortArray(arr);
//		Collections.sort(list);
//		for(StudentDto item: list) {
//			System.out.println(item);
//		}
//		Collections.sort(list, new IdComparator());
//		for (StudentDto item: list) {
//			System.out.println(item);
//		}
//		Collections.sort(list, new NameComparator());
//		for (StudentDto item: list) {
//			System.out.println(item);
//		}
		ArthematicOperations ato = new ArthematicOperations();
		int[] arr = {1,2,1,3,1,3,5,6,7};
		double res = ato.addTwonumbers(2, 5);
		double largestofthree = ato.largestOfThree(5, 6, 8);
		ato.sortIntArray(arr);
		HashMap<Integer, Integer> countvalue = ato.arrayElementscount(arr);
//		System.out.println("Sum of the two numbers is:" + res);
//		System.out.println("largst of Three Numbers is:" + largestofthree);
//		System.out.println(countvalue);

	}

}
