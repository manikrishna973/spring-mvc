package org.mani.model;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {

	private String fname;
	private String lname;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteProgrammingLanguage;
	private String[] operatingSystems;
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("US", "United States of America");
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("ITA", "Italy");
		
	}
	
	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}



	public String getFavoriteProgrammingLanguage() {
		return favoriteProgrammingLanguage;
	}



	public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
		this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
	}



	public String[] getOperatingSystems() {
		return operatingSystems;
	}



	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}



	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", country=" + country
				+ ", favoriteProgrammingLanguage=" + favoriteProgrammingLanguage + ", operatingSystems="
				+ Arrays.toString(operatingSystems) + "]";
	}



	
	
	

}
