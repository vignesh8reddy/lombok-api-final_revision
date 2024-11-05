package com.vignesh.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Employee {

	private int eid;
	private String ename;
	private int eage;
	@NonNull
	private String eaddress;
	private float esalary;
	
}

/*

.class file of above class has following code

public class Employee {
	
	private int eid;
	private String ename;
	private int eage;
	private String eaddress;
	private float esalary;
		
	public Employee() {
	//zero parameter constructor
	}
	public Employee(int eid, String ename, int eage, String eaddress, float esalary) {
	//all parameter constructor
	}
	public Employee(String eaddress) {
	//constructor with parameter as String eaddress
	}
	//@Data will generate setters, getters, toString, equals and hashcode methods and RequiredArgsConstructor
}


*/