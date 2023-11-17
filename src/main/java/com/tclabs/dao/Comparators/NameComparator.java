package com.tclabs.dao.Comparators;

import java.util.Comparator;

import com.tclabs.dto.StudentDto;

public class NameComparator  implements Comparator{

	public NameComparator() {

	}

	public int compare(Object o1, Object o2) {
		StudentDto dto1= (StudentDto)o1;
		StudentDto dto2= (StudentDto)o2;
		return dto1.getName().compareTo(dto2.getName());
	}
 
}
