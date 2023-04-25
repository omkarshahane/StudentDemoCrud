package com.demo.service;

import java.util.List;

import com.demo.bean.Student;

public interface StudentService {
	
	public void addStudent(Student sd);
	
	public List<Student> viewAllRecords();
	
	public void deleteRecord(int rollNo);
	
	public Student getByRollNo(int rollNo);
	
	public int updateRecord(Student sd);

}
