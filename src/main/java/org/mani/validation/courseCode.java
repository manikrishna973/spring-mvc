package org.mani.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraidValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface courseCode {

	public String value() default "C";

	public String message() default "Must start with 'C' ";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
