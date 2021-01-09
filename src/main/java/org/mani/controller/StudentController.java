package org.mani.controller;

import org.mani.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	/**
	 * using spring MVC form tags
	 * @param model
	 * @return
	 */
	@RequestMapping("/showForm")
	public String getStuForm(Model model) {		
		//student is referred as model attribute in spring mvc form
		Student theStudent = new Student();
		//theStudent.setFname("Mani"); pre-populates the form
		model.addAttribute("student", theStudent); //form deals with student model
		return "student-form";
	}
	
	/**
	 * @ModelAttribute will populate the formData of 'student' into the theStudent
	 * @param theStudent
	 * @param model
	 * @return
	 */
	@RequestMapping("processForm")
	public String processStudentForm(@ModelAttribute("student") Student  theStudent, Model model) {
		//theStudent.setFname(theStudent.getFname().toUpperCase()); //also this works
		//theStudent.setLname(theStudent.getLname().toUpperCase());
		//model.addAttribute("theStudent", theStudent);
		
		System.out.println(theStudent);
		return "student-confirmation";
	}
}
