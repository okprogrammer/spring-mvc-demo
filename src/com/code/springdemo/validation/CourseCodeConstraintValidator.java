package com.code.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;

	@Override
	public void initialize(CourseCode thCourseCode) {
		coursePrefix = thCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		if (theCode == null) {
			return true;
		}
		boolean result = false;
		for (String s : coursePrefix) {
			result = theCode.startsWith(s);
			if (result) {
				return result;
			}
		}

		return result;
	}

}
