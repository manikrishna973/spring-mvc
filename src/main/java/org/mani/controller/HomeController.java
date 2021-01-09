package org.mani.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	//controller method to show the initial HTML form
	@RequestMapping("showForm")
	public String getForm() {
		return "TheForm";
	}
	
	//controller method to process the form
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller method to the process the form version2
	@RequestMapping("v2/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		System.out.println(">> V2");
		//read data from HTML form
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		String result = "Hey! "+name;
		System.out.println("result: "+result);
		//add data to the model and return 'Model And View'
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	/**
	 * controller method to read the formData using spring annotation and bind data to variable
	 * @RequestParam("studentName") reads the formData and  bind the studentName into the variable 'name'
	 * 
	 * @param name
	 * @param model
	 * @return helloworld (view)
	 */
	@RequestMapping("v3/processForm")
	public String processForm(@RequestParam("studentName") String name, Model model) {
		System.out.println(">> V3");
		name = name.toUpperCase();
		String result = "Hey My Friend! "+name;
		System.out.println("result: "+result);
		//add data to the model and return 'Model And View'
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	
}
