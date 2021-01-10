package org.mani.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Customer {

	
	private String firstName;
	
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	//@NotBlank(message = "white spaces are not acceptable") //can be done with @InitBinder as well-in controller class 
	private String lastName;
	
	@Max(value = 10, message = "must be between 0 to 10")
	@Min(value = 0, message = "must be between 0 to 10")
	private Integer points;
	
	@Pattern(regexp = "^[A-Za-z0-9]{5}" , message = "must be only 5 char/digits" )
	private String postalCode;
	
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
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
}
