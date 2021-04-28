package com.nikhil.user.UserDetails.model;

import javax.validation.constraints.Size;

import lombok.Data;

/**
 * Occupation class is used for handling user occupation related information
 * 
 * @author NIKHIL
 * @since 28-04-2021
 *
 */
@Data
public class Occupation {

	private String title;

	@Size(min = 1, message = "Salary should be minimum 1")
	private Integer salary;

	public Occupation() {
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
