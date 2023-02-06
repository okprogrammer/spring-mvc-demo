package com.code.springdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	// create a method to show form
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// create a new student object
		Student theStudent = new Student();
		// add student object to the model attribute
		theModel.addAttribute("student", theStudent);
		// add the country options to the model
		theModel.addAttribute("theCountryOptions", countryOptions);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// log the input data
		System.out.println("The Student FirstName: " + theStudent.getFirstName());
		System.out.println("The Student LastName: " + theStudent.getLastName());
		return "student-confirmation";
	}
}
