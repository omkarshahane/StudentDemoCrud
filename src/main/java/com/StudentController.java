package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Student;
import com.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService ss;
	
	public StudentController() {
		
	}
	
	
	@PostMapping("/addRecord")
	public ModelAndView addStudent(@ModelAttribute Student sdt)
	{
		ss.addStudent(sdt);
		System.out.println(sdt);
		
		ModelAndView mv = new ModelAndView("Success");
		mv.addObject("message", "Record Added Successfully");
		
		return mv;
	}
	
	
	@RequestMapping("/viewRecord")
	public ModelAndView viewStudents(@ModelAttribute Student sdt)
	{
		 List l = ss.viewAllRecords();
		 ModelAndView mv = new ModelAndView("ViewStud");
		 mv.addObject("list", l);
		 
		return mv;
	}
	
	
	@RequestMapping("/edit/{rollNo}")
	public ModelAndView getByRollNo(@PathVariable int rollNo)
	{
		Student s = ss.getByRollNo(rollNo);
		
		ModelAndView mv = new ModelAndView("UpdateRecord", "stud", s); //viewName ModelName ModelObject
		
		return mv;
		
	}
	
	@RequestMapping("/update")
	public ModelAndView updateRecord(@RequestParam int rollNo,@RequestParam String sname, @RequestParam int st )
	{
		ss.updateRecord(new Student(rollNo, sname, st));
		ModelAndView mv = new ModelAndView("redirect:/viewRecord");
		return mv;
		
	}
	
	
	
	
	@RequestMapping("/deleteRecord/{rollNo}")
	public ModelAndView deleteRecord(@PathVariable int rollNo)
	{
		ss.deleteRecord(rollNo);
		
		ModelAndView mv = new ModelAndView("redirect:/viewRecord");
		return mv;
	}
	
	

}
