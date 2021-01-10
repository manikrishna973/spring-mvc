package org.mani.controller;

import javax.validation.Valid;

import org.mani.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	

	// add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	

	@RequestMapping("showForm")
	public String showCustForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		//can set default customer values to pre-populate the form
		
		return "customer/customer-form";
	}
	
	
	@RequestMapping("processForm")
	public String processCustForm(@Valid @ModelAttribute("customer")
	Customer theCustomer, 
	BindingResult bindingResult) {
		
		System.out.println("lastName: |"+theCustomer.getLastName()+"|");
		
		if(bindingResult.hasErrors()) {
			return "customer/customer-form";
		}else {
			return "customer/customer-confirmation";
		}
	}
}
