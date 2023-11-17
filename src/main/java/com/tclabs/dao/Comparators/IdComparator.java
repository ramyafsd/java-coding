package com.tclabs.dao.Comparators;

import java.util.Comparator;

import com.tclabs.dto.StudentDto;

public class IdComparator implements Comparator {

	public IdComparator() {

	}

	public int compare(Object o1, Object o2) {
		StudentDto dto1 = (StudentDto) o1;
		StudentDto dto2 = (StudentDto) o2;
		return dto1.getId() - dto2.getId();

	}

}
