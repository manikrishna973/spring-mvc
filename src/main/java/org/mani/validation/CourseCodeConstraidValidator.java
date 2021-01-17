package org.mani.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraidValidator
  implements ConstraintValidator<courseCode, String>{

	private String courseCodePrefix; 
	@Override
	public void initialize(courseCode constraintAnnotation) {

		this.courseCodePrefix=constraintAnnotation.value();
	}

	
	/**
	 * @param theCode is passed by user as form data
	 */
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

		boolean result;
		if(theCode!=null) {
			result=result=theCode.startsWith(courseCodePrefix);
		}else {
			//if user doesn't enter course code ignore validation as pass true
			result=true;
		}
		return result;
	}

}
