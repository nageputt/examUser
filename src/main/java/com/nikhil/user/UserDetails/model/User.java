package com.nikhil.user.UserDetails.model;

import javax.validation.constraints.Size;


import lombok.Data;

/**
 * User class is used for handling user related information
 * 
 * @author NIKHIL
 * @since 28-04-2021
 *
 */
@Data
public class User {
	
	@Size(min = 2, max = 40, message = "Name should be between 10 and 20 characters")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	@Size(min = 18, message = "Age should be minimum 18")
	private Integer age;
	
	private Occupation occupation;

}
