package com.demo.std.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.std.entity.Student;
import com.demo.std.service.Studentservice;

@Controller
public class Studentcontroller 
{
	private Studentservice studentservice;

	public Studentcontroller(Studentservice studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	@GetMapping("/students")
	public String liststudents(Model model) 
	{
		model.addAttribute("students", studentservice.getstudents());
		return "studentview";
		
	}
	
  @GetMapping("/students/new")	
  public String Createstudent(Model model)
  {
	  Student student = new Student();
	  model.addAttribute("student", student);
	  return "create_student";
	  
  }
  @PostMapping("/students")
  public String savestudent(@ModelAttribute("student") Student student)
  {
	  studentservice.savestudent(student);
	  return "redirect:/students";
  }
  
  @GetMapping("/students/edit/{id}")
  public String studentedit(@PathVariable Long id,Model model)
  {
	model.addAttribute("student",studentservice.getstudentbyid(id));
	 return "edit_student";
  }
  
  @PostMapping("/students/{id}")
  public String studentupdate(@PathVariable Long id, @ModelAttribute("student") Student student, Model model,HttpSession session)
  {
	  Student exstudents = studentservice.getstudentbyid(id);
	  
	  exstudents.setId(student.getId());
	  exstudents.setName(student.getName());
	  exstudents.setPlace(student.getPlace());
	  exstudents.setEmail(student.getEmail());
	  session.setAttribute("msg", "student added successfully!");
	  studentservice.updatestudent(exstudents);
	  return "redirect:/students";
  }
  
  @GetMapping("/students/{id}")
  public String deletestudent(@PathVariable Long id) 
  {
	  studentservice.deletestudentbyid(id);
	  return "redirect:/students";
  }

}
