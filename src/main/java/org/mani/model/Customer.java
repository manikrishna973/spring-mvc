package org.mani.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Customer {

	
	private String firstName;
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	//@NotBlank(message = "white spaces are not acceptable") //can be done with @InitBinder as well-in controller class 
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
