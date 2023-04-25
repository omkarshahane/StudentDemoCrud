package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Student;
import com.demo.dao.StudentDao;


@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentDao sd;
	
	@Override
	public void addStudent(Student st) {
		
		sd.save(st);
		
		
		
	}

	@Override
	public List<Student> viewAllRecords() {
		
		List<Student> slist = sd.findAll();

		return slist;
	}

	@Override
	public void deleteRecord(int rollNo) {
		sd.deleteById(rollNo);
		
		
	}
	
	@Override
	public Student getByRollNo(int rollNo) {
		
		Optional<Student> op = sd.findById(rollNo);
		
		
		
		return op.orElse(null);
	}
	
	

	@Override
	public int updateRecord(Student std) {
		
		
		
		Optional<Student> op = sd.findById(std.getRollNo());
		if(op.isPresent())
		{
			Student s = op.get();
			s.setName(std.getName());
			s.setStd(std.getStd());
			
			sd.save(s);
			
			return 1;
			
		}
		
		return 0;
	}

	
	
	

}
