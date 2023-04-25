package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentcrud")
public class Student {

	@Id
	@GeneratedValue
	private int rollNo;
	
	@Column(length = 10)
	private String name;
	
	
	private int std;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int rollNo, String name, int std) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStd() {
		return std;
	}


	public void setStd(int std) {
		this.std = std;
	}
	
	


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", std=" + std + "]";
	}
	
	
	

}
