package com.nikhil.user.UserDetails.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nikhil.user.UserDetails.model.User;

/**
 * UserDb class is used for handling user related db operations
 * 
 * @author NIKHIL
 * @since 28-04-2021
 *
 */
public class UserDb {

	private List<User> users;
	
	public UserDb() {
		users = new ArrayList<User>();
	}

	/**
	 * getUser method is used to fetch the user details with selected user name
	 * @param userName
	 * @return
	 */
	public User getUser(String userName) {
		List<User> filteredUsers = users.stream().filter(user -> user.getName().equals(userName))
				.collect(Collectors.toList());
		if (filteredUsers != null && filteredUsers.size() > 0) {
			return filteredUsers.get(0);
		} else {
			return null;
		}
	}

	/**
	 * getSelectedUsers method is used to get selected user details based on salary limits
	 * @param minSalaryLimit
	 * @param maxSalaryLimit
	 * @return list
	 */
	public List<User> getSelectedUsers(Integer minSalaryLimit, Integer maxSalaryLimit) {
		List<User> filteredUsers = users.stream()
				.filter(user -> (user.getOccupation().getSalary() >= minSalaryLimit && user.getOccupation().getSalary() < maxSalaryLimit))
				.collect(Collectors.toList());
		return filteredUsers;
	}

	/**
	 * addUser method is used to add user details to data base
	 * @param user
	 */
	public void addUser(User user) {
		users.add(user);
	}

	/**
	 * fetchAll method is used to all user details
	 * @return list
	 */
	public List<User> fetchAll() {
		return users;
	}
}
