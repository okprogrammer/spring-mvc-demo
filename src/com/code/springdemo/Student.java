package com.code.springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;

	private LinkedHashMap<String, String> countryOptions;

	private String favoriteLanguage;

	private LinkedHashMap<String, String> favouriteLanguageOptions;

	private String[] operatingSystems;

	public Student() {
		// populate country options: used ISO country code
//		countryOptions = new LinkedHashMap<>();
//		
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("US", "United States of America");
//		System.out.println(countryOptions);
		favouriteLanguageOptions = new LinkedHashMap<>();
		favouriteLanguageOptions.put("JAVA", "JAVA");
		favouriteLanguageOptions.put("Python", "Python");
		favouriteLanguageOptions.put("JavaScript", "JavaScript");
		favouriteLanguageOptions.put("C++", "C++");
		favouriteLanguageOptions.put("Ruby", "Ruby");
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public void setFavouriteLanguageOptions(LinkedHashMap<String, String> favouriteLanguageOptions) {
		this.favouriteLanguageOptions = favouriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
