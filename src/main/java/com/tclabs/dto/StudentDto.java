package com.tclabs.dto;

public class StudentDto implements Comparable<StudentDto> {
	
	
	public StudentDto(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public int compareTo(StudentDto o) {
		// TODO Auto-generated method stub
//		return (this.id - o.id);
		return (this.name).compareTo(o.name);
	}
	
	
	

}
